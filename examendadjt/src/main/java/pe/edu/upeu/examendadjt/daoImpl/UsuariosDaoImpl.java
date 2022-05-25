package pe.edu.upeu.examendadjt.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.examendadjt.config.Conexion;
import pe.edu.upeu.examendadjt.dao.UsuariosDao;
import pe.edu.upeu.examendadjt.model.Usuarios;
/**
 *
 * @author Jhobany
 */
public class UsuariosDaoImpl implements UsuariosDao{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Usuarios us) {
        String SQL = "INSERT INTO usuarios(username, password, idpersona, idrol, fechacreacion, estado) VALUES(?,?,?,?,now(),true)";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, us.getUsername());
            ps.setString(2, us.getPassword());
            ps.setInt(3, us.getIdpersona());
            ps.setInt(4, us.getIdrol());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;  
    }

    @Override
    public int update(Usuarios us) {
        String SQL = "UPDATE usuarios SET username=?, password=?, idpersona=?, idrol=? WHERE idusuario=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, us.getUsername());
            ps.setString(2, us.getPassword());
            ps.setInt(3, us.getIdpersona());
            ps.setInt(4, us.getIdrol());
            ps.setInt(5, us.getIdusuario());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "DELETE FROM usuarios WHERE idusuario=?";
        int x = 0;
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Usuarios read(int id) {
        Usuarios u = new Usuarios();
        String SQL = "SELECT *FROM usuarios WHERE idusuario=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                u.setIdusuario(rs.getInt("idusuario"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setIdpersona(rs.getInt("idpersona"));
                u.setIdrol(rs.getInt("idrol"));
                u.setFechacreacion(rs.getString("fechacreacion"));
                u.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return u;
    }
    

    @Override
    public List<Usuarios> readAll() {
        List<Usuarios> lista = new ArrayList<>();
        String SQL = "select * from usuarios";
        try{
            cx = Conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
            Usuarios u = new Usuarios();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
            u.setIdpersona(rs.getInt("idpersona"));
            u.setIdrol(rs.getInt("idrol"));
            u.setFechacreacion(rs.getString("fechacreacion"));
            u.setEstado(rs.getString("estado"));
            lista.add(u);
            }
        } catch (SQLException e){
            System.out.print("error: " +e);
        }
        return lista;
    }
    
    /*@Override
    
    public List<Map<String,Object >> readA112(){
    List<Map<String, Object >> lista=new ArrayList<>();
    String SQL = "select u.idusuario,u.username,p.apellidos,p.nombres,r.nombre from usuarios as u"+
                 "inner join roles as r on u.idrol-r.idrol"+
                 "inner join personas as p on u.idpersona-p.idpersona";
    try{
        cx = Conexion.getConex();
        ps = cx.prepareStatement(SQL);
        rs = ps.executeQuery();
        while(rs.next()){
            Map<String, Object>map = new HashMap<>();
            map.put("idusuario",rs.getInt("idusuario"));
            map.put("username",rs.getString("username"));
            map.put("apellidos",rs.getString("apellidos"));
            map.put("nombres",rs.getString("nombres"));
            map.put("rol",rs.getString("nombre"));
            lista.add(map);
        }
    }catch(SQLException e){
    }
    return lista;
    }
    */
}
