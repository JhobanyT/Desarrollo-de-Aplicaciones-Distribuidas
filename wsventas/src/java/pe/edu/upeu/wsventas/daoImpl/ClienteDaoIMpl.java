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
import pe.edu.upeu.wsventas.dao.ClienteDao;
import pe.edu.upeu.wsventas.model.Cliente;

/**
 *
 * @author Jhobany
 */
public class ClienteDaoIMpl implements ClienteDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Cliente esc) {
        String SQL = "INSERT INTO cliente(nombre, apellidos, dni, direccion) VALUES(?,?,?,?)";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getNombre());
            ps.setString(2, esc.getApellidos());
            ps.setString(3, esc.getDni());
            ps.setString(4, esc.getDireccion());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;       
    }

    @Override
    public int update(Cliente esc) {
        String SQL = "UPDATE cliente SET nombre=?, apellidos=?, dni=?, direccion=? WHERE idcliente=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
           ps.setString(1, esc.getNombre());
            ps.setString(2, esc.getApellidos());
            ps.setString(3, esc.getDni());
            ps.setString(4, esc.getDireccion());
            ps.setInt(5, esc.getIdcliente());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "DELETE FROM cliente WHERE idcliente=?";
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
    public Cliente read(int id) {
        String SQL = "SELECT *FROM cliente WHERE idcliente=?";
        Cliente esc = new Cliente();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                esc.setIdcliente(rs.getInt("idcliente"));
                esc.setNombre(rs.getString("nombre"));
                esc.setApellidos(rs.getString("apellidos"));
                esc.setDni(rs.getString("dni"));
                esc.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return esc;
    }

    @Override
    public List<Cliente> readAll() {
        String SQL = "SELECT *FROM cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente esc = new Cliente();
                esc.setIdcliente(rs.getInt("idcliente"));
                esc.setNombre(rs.getString("nombre"));
                esc.setApellidos(rs.getString("apellidos"));
                esc.setDni(rs.getString("dni"));
                esc.setDireccion(rs.getString("direccion"));
                lista.add(esc);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}