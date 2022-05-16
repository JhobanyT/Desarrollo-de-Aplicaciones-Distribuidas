/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.ws001.test;

import pe.edu.upeu.ws001.config.Conexion;

/**
 *
 * @author Jhobany
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }

        // TODO code application logic here
    }
    
}
