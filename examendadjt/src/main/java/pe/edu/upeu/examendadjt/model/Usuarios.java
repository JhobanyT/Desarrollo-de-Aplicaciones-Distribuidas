/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examendadjt.model;

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

public class Usuarios {
    private int idusuario;
    private String username;
    private String password;
    private int idpersona;
    private int idrol;
    private String fechacreacion;
    private String estado;
}
