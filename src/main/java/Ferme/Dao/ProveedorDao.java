package Ferme.Dao;

import Ferme.Dto.Empresa;
import Ferme.Dto.Proveedor;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;


public class ProveedorDao implements Crud {

    Proveedor prove = new Proveedor();
    Empresa emp = new Empresa();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {

        ArrayList list = new ArrayList();
        query = "{call LISTARTODOSPROVEEDORES(?)}";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            rs = (ResultSet) call.getObject(1);
            while (rs.next()) {

                prove.setCorreo(rs.getString("correoprov"));
                prove.setRunProveedor(rs.getString("runProveedor"));
                prove.setDigitoVerif(rs.getString("digitoverif"));
                prove.setEstado(rs.getInt("estado"));
                prove.setNombre(rs.getString("nombre"));
                prove.setNumeroTelef(rs.getString("numerotel"));
                emp.setCorreoE(rs.getString("correoemp"));
                emp.setRutEmpresa(rs.getString("RUTEMPRESA"));
                emp.setDvRut(rs.getString("dvrut"));
                emp.setNumeroTelf(rs.getString("NUMEROTEL"));
                emp.setNombreEmpresa(rs.getString("NOMBTEEMPRESA"));
                prove.setEmpresa(emp);
                list.add(prove);
            }
        } catch (SQLException e) {
            System.out.println("error al listar " + e.getMessage());
        }
        return list;
    }

    public Proveedor BuscarProveedor(String rut) {

        try {
            query = "{call LISTARPROVEEDOR(?,?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, rut);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                prove.setCorreo(rs.getString("correoprov"));
                prove.setRunProveedor(rs.getString("runProveedor"));
                prove.setDigitoVerif(rs.getString("digitoverif"));
                prove.setEstado(rs.getInt("estado"));
                prove.setNombre(rs.getString("nombre"));
                prove.setNumeroTelef(rs.getString("numerotel"));
                emp.setCorreoE(rs.getString("correoemp"));
                emp.setRutEmpresa(rs.getString("RUTEMPRESA"));
                emp.setDvRut(rs.getString("dvrut"));
                emp.setNumeroTelf(rs.getString("NUMEROTEL"));
                emp.setNombreEmpresa(rs.getString("NOMBTEEMPRESA"));
                prove.setEmpresa(emp);

            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        }
        return prove;
    }

    public boolean habilitar(String rut) {
        try {
            query = "{ call HABILITAR_PROVEEDOR(?)}";
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
            query = "{ call DESHABILITAR_PROVEEDOR(?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, rut);
            call.execute();
        } catch (SQLException e) {
            System.out.println("error al eliminar" + e.getMessage());
        }
        return true;

    }

}
