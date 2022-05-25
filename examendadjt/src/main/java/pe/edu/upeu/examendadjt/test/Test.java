/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.examendadjt.test;

import com.google.gson.Gson;
import java.sql.SQLException;
import pe.edu.upeu.examendadjt.config.Conexion;
import pe.edu.upeu.examendadjt.dao.UsuariosDao;
import pe.edu.upeu.examendadjt.daoImpl.UsuariosDaoImpl;

/**
 *
 * @author Jhobany
 */
public class Test {
    static Gson gson = new Gson();
    static UsuariosDao p = new UsuariosDaoImpl();
    //static UsuariosDao us = new UsuariosDaoImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
        System.out.print(gson.toJson(p.readAll()));
        //System.out.println(gson.toJson(us.readA112()));
        // TODO code application logic here
    }
    
}
