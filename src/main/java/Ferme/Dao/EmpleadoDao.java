package Ferme.Dao;

import Ferme.Dto.*;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        }
        return emp;
    }

    public Empleado agregarEmpleado() {
        try {
            query = "{call AGREGAR_EMPLEADO(?,?,?,?,?,?,?,?,?,?,?)}";
            con = Conexion.getConexion();

            call = con.prepareCall(query);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                emp.setIDCARGO(rs.getInt("idcargo"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellido(rs.getString("apellido"));
    

            }
        } catch (SQLException e) {
            System.out.println("Error al agregar " + e.getMessage());
        }
        return agregarEmpleado();
    }

}
