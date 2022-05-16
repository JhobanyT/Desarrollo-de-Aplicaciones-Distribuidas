/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.wsventas.test;

import java.sql.SQLException;
import pe.edu.upeu.wsventas.config.Conexion;

/**
 *
 * @author Jhobany
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }

        // TODO code application logic here
    }
    
}
