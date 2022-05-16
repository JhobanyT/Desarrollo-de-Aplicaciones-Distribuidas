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
import pe.edu.upeu.wsventas.dao.ProductoDao;
import pe.edu.upeu.wsventas.model.Producto;

/**
 *
 * @author Jhobany
 */
public class ProductoDaoIMpl implements ProductoDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Producto esc) {
        String SQL = "INSERT INTO escuela(nombre) VALUES(?)";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getNomproducto());
            ps.setDouble(2, esc.getPrecio());
            ps.setInt(3, esc.getStock());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;       
    }

    @Override
    public int update(Producto esc) {
        String SQL = "UPDATE escuela SET nombre=? WHERE idescuela=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getNomproducto());
            ps.setDouble(2, esc.getPrecio());
            ps.setInt(3, esc.getStock());
            ps.setInt(4, esc.getIdproducto());
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
    public Producto read(int id) {
        String SQL = "SELECT *FROM escuela WHERE idescuela=?";
        Producto esc = new Producto();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                esc.setIdproducto(rs.getInt("idproducto"));
                esc.setNomproducto(rs.getString("nomproducto"));
                esc.setPrecio(rs.getDouble("precio"));
                esc.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return esc;
    }

    @Override
    public List<Producto> readAll() {
        String SQL = "SELECT *FROM escuela";
        List<Producto> lista = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto esc = new Producto();
                esc.setIdproducto(rs.getInt("idproducto"));
                esc.setNomproducto(rs.getString("nomproducto"));
                esc.setPrecio(rs.getDouble("precio"));
                esc.setStock(rs.getInt("stock"));
                lista.add(esc);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
