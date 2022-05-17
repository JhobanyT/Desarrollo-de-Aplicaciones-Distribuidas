/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.wsventas.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.wsventas.dao.ClienteDao;
import pe.edu.upeu.wsventas.daoImpl.ClienteDaoIMpl;
import pe.edu.upeu.wsventas.model.Cliente;

/**
 *
 * @author Jhobany
 */
@WebService(serviceName = "ClienteWebService")
public class ClienteWebService {

    /**
     * This is a sample web service operation
     */
    ClienteDao clienteDao = new ClienteDaoIMpl();
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "dni") String dni, @WebParam(name = "direccion") String direccion) {
        //TODO write your implementation code here:
        return clienteDao.create(new Cliente(0, nombre, apellidos, dni, direccion));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idcliente") int idcliente, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "dni") String dni, @WebParam(name = "direccion") String direccion) {
        //TODO write your implementation code here:
        return clienteDao.update(new Cliente(idcliente, nombre, apellidos, dni, direccion));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "idcliente") int id) {
        //TODO write your implementation code here:
        return clienteDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Cliente read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return clienteDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readAll")
    public List<Cliente> readAll() {
        //TODO write your implementation code here:
        return clienteDao.readAll();
    }
}
