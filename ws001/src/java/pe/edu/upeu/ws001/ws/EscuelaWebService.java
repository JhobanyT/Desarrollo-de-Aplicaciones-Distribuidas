/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.ws001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.ws001.dao.EscuelaDao;
import pe.edu.upeu.ws001.daoImpl.EscuelaDaoIMpl;
import pe.edu.upeu.ws001.model.Escuela;

/**
 *
 * @author Jhobany
 */
@WebService(serviceName = "EscuelaWebService")
public class EscuelaWebService {
    
    EscuelaDao escuelaDao=new EscuelaDaoIMpl();

    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return escuelaDao.create(new Escuela(0,nombre));
    }


    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idescuela") int idescuela, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return escuelaDao.update(new Escuela(idescuela, nombre));
    }

    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuelaDao.delete(id);
    }

    @WebMethod(operationName = "read")
    public Escuela read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuelaDao.read(id);
    }

    @WebMethod(operationName = "readAll")
    public List<Escuela> readAll() {
        //TODO write your implementation code here:
        return escuelaDao.readAll();
    }





}
