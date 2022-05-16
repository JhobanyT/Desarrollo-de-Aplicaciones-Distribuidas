/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.wsventas.dao;

import java.util.List;
import pe.edu.upeu.wsventas.model.Venta;

/**
 *
 * @author Jhobany
 */
public interface VentaDao {
    int create(Venta esc);
    int update(Venta esc);
    int delete(int id);
    Venta read(int id);
    List<Venta> readAll();
}
