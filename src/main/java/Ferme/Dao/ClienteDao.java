package Ferme.Dao;

import FermeEscritoriodb.Conexion;
import Ferme.Dto.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

public class ClienteDao implements Crud {

    Cliente cli = new Cliente();
    Direccion direc = new Direccion();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {

        ArrayList list = new ArrayList();
        query = "{call LISTARTODOSCLIENTES(?)}";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                cli = new Cliente();
                cli.setEstado(rs.getInt("estado"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setCorreo(rs.getString("CORREOCLI"));
                cli.setContrasena(rs.getString("contrasena"));
                cli.setRunCliente(rs.getString("runCliente"));
                cli.setDigitoVerif(rs.getString("digitoVerif"));
                direc.setComuna(rs.getString("COMUNA"));
                direc.setNumero(rs.getNString("numero"));
                direc.setPasaje(rs.getString("pasaje"));
//            direc.setRegion(rs.getInt("region"));
                cli.setDireccion(direc);
                list.add(cli);
            }
        } catch (Exception e) {
            System.out.println("error al listar" + e.getMessage());
        }
        return list;
    }

    public Cliente BuscarCliente(String rut) {

        try {
            query = "{call LISTARCLIENTES(?,?)}";
            con = Conexion.getConexion();

            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setString(2, rut);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                cli.setEstado(rs.getInt("estado"));
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setCorreo(rs.getString("CORREOCLI"));
                cli.setContrasena(rs.getString("contrasena"));
                cli.setRunCliente(rs.getString("runCliente"));
                cli.setDigitoVerif(rs.getString("digitoVerif"));
                direc.setComuna(rs.getString("COMUNA"));
                direc.setNumero(rs.getNString("numero"));
                direc.setPasaje(rs.getString("pasaje"));
//             direc.setRegion(rs.getInt("region"));
                cli.setDireccion(direc);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        }
        return cli;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        try {
            query = "{ call DESHABILITAR_CLIENTE(?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, rut);
            call.execute();
        } catch (SQLException e) {
            System.out.println("error al eliminar" + e.getMessage());
        }
        return true;
    }

    public boolean habilitar(String rut) {
        try {
            query = "{ call HABILITAR_CLIENTE(?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, rut);
            call.execute();
        } catch (SQLException e) {
            System.out.println("error al Habilitar" + e.getMessage());
        }
        return true;
    }

    public boolean actualizar(String rut, String dv, String direccion, String CORREOCLI, String contrasena, String nombre, String apellido) {

        try {
            Connection conect = Conexion.getConexion();
            query = "Update cliente set direccion = ? where runcliente =? and digitoVerif=?";
            PreparedStatement busc = conect.prepareStatement(query);

            busc.setString(1, direccion);
            busc.setString(2, CORREOCLI);
            busc.setString(3, contrasena);
            busc.setString(4, nombre);
            busc.setString(5, apellido);
            busc.setString(6, rut);
            busc.setString(7, dv);

            if (busc.executeUpdate() > 0) {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("error al eliminar" + e.getMessage());
        }
        return true;
    }

}
