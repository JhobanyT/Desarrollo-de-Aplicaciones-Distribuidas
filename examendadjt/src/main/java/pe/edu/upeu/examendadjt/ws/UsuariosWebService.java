/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.examendadjt.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.examendadjt.dao.UsuariosDao;
import pe.edu.upeu.examendadjt.daoImpl.UsuariosDaoImpl;
import pe.edu.upeu.examendadjt.model.Usuarios;

/**
 *
 * @author Jhobany
 */
@WebService(serviceName = "UsuariosWebService")
public class UsuariosWebService {

    /**
     * Web service operation
     */
    UsuariosDao usuariosDao = new UsuariosDaoImpl();
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "idpersona") int idpersona, @WebParam(name = "idrol") int idrol, @WebParam(name = "fechacreacion") String fechacreacion, @WebParam(name = "estado") String estado) {
        //TODO write your implementation code here:
        return usuariosDao.create(new Usuarios(0, username, password, idpersona, idrol, fechacreacion, estado));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "idpersona") int idpersona, @WebParam(name = "idrol") int idrol, @WebParam(name = "fechacreacion") String fechacreacion, @WebParam(name = "estado") String estado) {
        //TODO write your implementation code here:
        return usuariosDao.update(new Usuarios(idusuario, username, password, idpersona, idrol, fechacreacion, estado));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return usuariosDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Usuarios read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return usuariosDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readAll")
    public List<Usuarios> readAll() {
        //TODO write your implementation code here:
        return usuariosDao.readAll();
    }
}
