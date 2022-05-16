/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.wsventas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jhobany
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class cliente {
    private int idcliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
}
