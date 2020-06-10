package Ferme.Dao;

import Ferme.Dto.*;
import FermeEscritoriodb.Conexion;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

public class EmpleadoDao implements Crud {

    Empleado emp = new Empleado();
    Sucursal suc = new Sucursal();
    Direccion direc = new Direccion();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {

        ArrayList list = new ArrayList();
        query = "{call LISTARTODOSEMPLEADOS(?)}";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                emp.setApellido(rs.getString("apellido"));
                emp.setContrasena("contrasena");
                emp.setDigitoVerificador(rs.getString("digitoverif"));
                emp.setEstado(rs.getInt("estado"));
                emp.setNombre(rs.getString("nombree"));
                emp.setRunEmpleado(rs.getString("runempleado"));
                emp.setSexo(rs.getInt("sexoe"));
                emp.setCorreo(rs.getString("correoemple"));
                emp.setIDCARGO(rs.getInt("IDCARGO"));
                direc.setComuna(rs.getString("comuna"));
                direc.setNumero(rs.getString("numero"));
                direc.setNumeroDepto(rs.getString("numerodepto"));
                direc.setPasaje(rs.getString("pasaje"));
                direc.setRegion(rs.getInt("region"));
                suc.setNombre(rs.getString("NOMBRES"));
                suc.setNumFono(rs.getString("telefono"));
                emp.setSucursal(suc);
                emp.setDireccion(direc);
                list.add(emp);

            }
        } catch (SQLException e) {
            System.out.println("error al listar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Empleado BuscarEmpleado(String rut) {

        try {
            query = "{call LISTAREMPLEADO(?,?)}";
            con = Conexion.getConexion();

            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, rut);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                emp.setApellido(rs.getString("apellido"));
                emp.setContrasena(rs.getString("contrasena"));
                emp.setDigitoVerificador(rs.getString("digitoverif"));
                emp.setEstado(rs.getInt("estado"));
                emp.setNombre(rs.getString("nombree"));
                emp.setRunEmpleado(rs.getString("runempleado"));
                emp.setSexo(rs.getInt("sexoe"));
                emp.setCorreo(rs.getString("correoemple"));
                emp.setIDCARGO(rs.getInt("IDCARGO"));
                direc.setComuna(rs.getString("comuna"));
                direc.setNumero(rs.getString("numero"));
                direc.setNumeroDepto(rs.getString("numerodepto"));
                direc.setPasaje(rs.getString("pasaje"));
                direc.setRegion(rs.getInt("region"));
                suc.setNombre(rs.getString("NOMBRES"));
                suc.setNumFono(rs.getString("telefono"));
                emp.setSucursal(suc);
                emp.setDireccion(direc);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    public Empleado BuscarEmpleadoPorMail(String mail) {

        try {
            query = "{select * from empleado where correoemple =? }";
            con = Conexion.getConexion();

            call = con.prepareCall(query);
//            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, mail);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                emp.setApellido(rs.getString("apellido"));
                emp.setContrasena("contrasena");
                emp.setDigitoVerificador(rs.getString("digitoverif"));
                emp.setEstado(rs.getInt("estado"));
                emp.setNombre(rs.getString("nombree"));
                emp.setRunEmpleado(rs.getString("runempleado"));
                emp.setSexo(rs.getInt("sexoe"));
                emp.setCorreo(rs.getString("correoemple"));
                emp.setIDCARGO(rs.getInt("IDCARGO"));
                direc.setComuna(rs.getString("comuna"));
                direc.setNumero(rs.getString("numero"));
                direc.setNumeroDepto(rs.getString("numerodepto"));
                direc.setPasaje(rs.getString("pasaje"));
                direc.setRegion(rs.getInt("region"));
                suc.setNombre(rs.getString("NOMBRES"));
                suc.setNumFono(rs.getString("telefono"));
                emp.setSucursal(suc);
                emp.setDireccion(direc);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    public boolean habilitar(String rut) {
        try {
            query = "{ call HABILITAR_EMPLEADO(?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, rut);
            call.execute();
        } catch (SQLException e) {
            System.out.println("error al Habilitar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        try {
            query = "{ call DESHABILITAR_EMPLEADO(?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, rut);
            call.execute();
        } catch (SQLException e) {
            System.out.println("error al eliminar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public Empleado logIn(String user, String pass) {

        try {
            Codificador cod = new Codificador();
            String has = cod.sha256(pass);
            query = "select * from empleado where correoemple=? and contrasena=?";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, user);
            call.setString(2, has);
            rs = call.executeQuery();

            while (rs.next()) {
                emp.setApellido(rs.getString("apellido"));
                emp.setContrasena("contrasena");
                emp.setDigitoVerificador(rs.getString("digitoverif"));
                emp.setEstado(rs.getInt("estado"));
                emp.setNombre(rs.getString("nombree"));
                emp.setRunEmpleado(rs.getString("runempleado"));
                emp.setSexo(rs.getInt("sexoe"));
                emp.setCorreo(rs.getString("correoemple"));
                emp.setIDCARGO(rs.getInt("IDCARGO"));
                emp.setCambioPass(rs.getInt("cambioPass"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

     public boolean  cambiarPass(String rut,String pass,int cambioPass ){
        
        try {
            Codificador cod =new Codificador();
            String has=cod.sha256(pass);
            query = "update empleado set contrasena = ? ,cambioPass=? where runempleado = ?";
            con = Conexion.getConexion();            
            call = con.prepareCall(query);
            call.setString(1, has);
            call.setInt(2, cambioPass);
            call.setString(3, rut);          
            rs = call.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }


    public boolean agregarEmpleado(int idDirecc,int idSucur,String runEmp,String dv,int sexo,String nombre,String apellido,String correo,String pass,int cargo) {
        try {
            Codificador cod =new Codificador();
             String has=cod.sha256(pass);
            int estado=1;
            int cambiop=0;
            query = "{call AGREGAR_EMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?)}";
            con = Conexion.getConexion();
            
            call = con.prepareCall(query);
            call.setInt(1, cargo);
            call.setInt(2, idDirecc);
            call.setInt(3, idSucur);
            call.setInt(4,estado);
            call.setString(5,runEmp);
            call.setInt(6,sexo);
            call.setString(7, dv);            
            call.setString(8,nombre);
            call.setString(9,apellido);
            call.setString(10,correo);
            call.setString(11,has);
            call.setInt(12, cambiop);
            call.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar " + e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean ModificarE(String nombre,String apellido,String correo,String contra ,String run) throws SQLException{          
        try{
            query = "update empleado set nombree = ? ,apellido=?,correoemple=?,contrasena=?  where runempleado = ?";
            Codificador cod =new Codificador();
            String has=cod.sha256(contra);
            con = Conexion.getConexion();            
            call = con.prepareCall(query);
            call.setString(1, nombre);
            call.setString(2, apellido);
            call.setString(3, correo);
            call.setString(4, has);
            call.setString(5, run);          
            rs = call.executeQuery();
        } catch (SQLException e) {
            System.out.println("error al modificar un empleado"+e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
