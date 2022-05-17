/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.wsventas.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.wsventas.dao.DetalleDao;
import pe.edu.upeu.wsventas.daoImpl.DetalleDaoIMpl;
import pe.edu.upeu.wsventas.model.Detalle;

/**
 *
 * @author Jhobany
 */
@WebService(serviceName = "DetalleWebService")
public class DetalleWebService {

    DetalleDao detalleDao = new DetalleDaoIMpl();
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "precio") double precio, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "idproducto") int idproducto, @WebParam(name = "idventa") int idventa) {
        //TODO write your implementation code here:
        return detalleDao.create(new Detalle(0, precio, cantidad, idproducto, idventa));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "iddetalle") int iddetalle, @WebParam(name = "precio") double precio, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "idproducto") int idproducto, @WebParam(name = "idventa") int idventa) {
        //TODO write your implementation code here:
        return detalleDao.update(new Detalle(iddetalle, precio, cantidad, idproducto, idventa));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "iddetalle") int id) {
        //TODO write your implementation code here:
        return detalleDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Detalle read(@WebParam(name = "iddetalle") int id) {
        //TODO write your implementation code here:
        return detalleDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readAll")
    public List<Detalle> readAll() {
        //TODO write your implementation code here:
        return detalleDao.readAll();
    }
}
