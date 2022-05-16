/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.ws001.dao;

import java.util.List;
import pe.edu.upeu.ws001.model.Escuela;

/**
 *
 * @author Jhobany
 */
public interface EscuelaDao {
    int create(Escuela esc);
    int update(Escuela esc);
    int delete(int id);
    Escuela read(int id);
    List<Escuela> readAll();
}
