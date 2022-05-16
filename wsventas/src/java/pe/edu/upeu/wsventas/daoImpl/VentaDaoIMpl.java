/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.wsventas.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.wsventas.config.Conexion;
import pe.edu.upeu.wsventas.dao.VentaDao;
import pe.edu.upeu.wsventas.model.Venta;

/**
 *
 * @author Jhobany
 */
public class VentaDaoIMpl implements VentaDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Venta esc) {
        String SQL = "INSERT INTO escuela(nombre) VALUES(?)";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getTipodoc());
            ps.setString(2, esc.getNumdoc());
            ps.setInt(3, esc.getIdcliente());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;       
    }

    @Override
    public int update(Venta esc) {
        String SQL = "UPDATE escuela SET nombre=? WHERE idescuela=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
           ps.setString(1, esc.getTipodoc());
            ps.setString(2, esc.getNumdoc());
            ps.setInt(3, esc.getIdcliente());
            ps.setInt(4, esc.getIdventa());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "DELETE FROM escuela WHERE idescuela=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }
    @Override
    public Venta read(int id) {
        String SQL = "SELECT *FROM escuela WHERE idescuela=?";
        Venta esc = new Venta();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                esc.setIdventa(rs.getInt("idventa"));
                esc.setTipodoc(rs.getString("tipodoc"));
                esc.setNumdoc(rs.getString("numdoc"));
                esc.setIdcliente(rs.getInt("idcliente"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return esc;
    }

    @Override
    public List<Venta> readAll() {
        String SQL = "SELECT *FROM escuela";
        List<Venta> lista = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Venta esc = new Venta();
                esc.setIdventa(rs.getInt("idventa"));
                esc.setTipodoc(rs.getString("tipodoc"));
                esc.setNumdoc(rs.getString("numdoc"));
                esc.setIdcliente(rs.getInt("idcliente"));
                lista.add(esc);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
