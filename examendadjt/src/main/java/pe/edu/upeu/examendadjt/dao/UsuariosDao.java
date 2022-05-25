/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.examendadjt.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.examendadjt.model.Usuarios;

/**
 *
 * @author Jhobany
 */
public interface UsuariosDao {
    int create(Usuarios esc);
    int update(Usuarios esc);
    int delete(int id);
    Usuarios read(int id);
    List<Usuarios> readAll();
    //List<Map<String,Object >> readA112();

}
