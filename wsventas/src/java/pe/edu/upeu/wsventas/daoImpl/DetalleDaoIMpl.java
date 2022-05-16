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
import pe.edu.upeu.wsventas.dao.DetalleDao;
import pe.edu.upeu.wsventas.model.Detalle;

/**
 *
 * @author Jhobany
 */
public class DetalleDaoIMpl implements DetalleDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Detalle esc) {
        String SQL = "INSERT INTO escuela(nombre) VALUES(?)";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setDouble(1, esc.getPrecio());
            ps.setInt(2, esc.getCantidad());
            ps.setInt(3, esc.getIdproducto());
            ps.setInt(4, esc.getIdventa());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;       
    }

    @Override
    public int update(Detalle esc) {
        String SQL = "UPDATE escuela SET nombre=? WHERE idescuela=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
           ps.setDouble(1, esc.getPrecio());
            ps.setInt(2, esc.getCantidad());
            ps.setInt(3, esc.getIdproducto());
            ps.setInt(4, esc.getIdventa());
            ps.setInt(5, esc.getIddetalle());
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
    public Detalle read(int id) {
        String SQL = "SELECT *FROM escuela WHERE idescuela=?";
        Detalle esc = new Detalle();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                esc.setIddetalle(rs.getInt("iddetalle"));
                esc.setPrecio(rs.getDouble("precio"));
                esc.setCantidad(rs.getInt("cantidad"));
                esc.setIdventa(rs.getInt("idventa"));
                esc.setIdproducto(rs.getInt("idproducto"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return esc;
    }

    @Override
    public List<Detalle> readAll() {
        String SQL = "SELECT *FROM escuela";
        List<Detalle> lista = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Detalle esc = new Detalle();
                esc.setIddetalle(rs.getInt("iddetalle"));
                esc.setPrecio(rs.getDouble("precio"));
                esc.setCantidad(rs.getInt("cantidad"));
                esc.setIdventa(rs.getInt("idventa"));
                esc.setIdproducto(rs.getInt("idproducto"));
                lista.add(esc);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}