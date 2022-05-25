/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examendadjt.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jhobany
 */
public class Conexion {
    private static final String URL="jdbc:postgresql://ec2-34-201-95-176.compute-1.amazonaws.com:5432/d7fumuoaqqe2ek";
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String PASS="9d7cf3fa8124e1f04082e9f124d4f7171e55dded124f77da9c732bc4ff8be45b";
    private static final String USER="aqebjeqvkzrpej";
    private static Connection cx = null;
    public static Connection getConex() throws SQLException{
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }
}
