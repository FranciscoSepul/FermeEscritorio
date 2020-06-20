package Ferme.Dao;

import Ferme.Dto.*;
import FermeEscritoriodb.*;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleVentaDao implements Crud {

    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        ArrayList list = new ArrayList();
        query = "Select * from detalleventa";
        try (PreparedStatement busc = Conexion.getConexion().prepareStatement(query)) {
            ResultSet rs = busc.executeQuery();
            while (rs.next()) {
                DetalleVentas dev = new DetalleVentas();
                dev.setCantidad(rs.getInt("Cantidad"));
                dev.setFechaCompra(rs.getString("FechaCompra"));
                dev.setTotal(rs.getInt("Total"));
                list.add(dev);
            }
        } catch (Exception e) {
            System.out.println("error al listar" + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean agregarDetalleVenta(int idp, String fecha, int cantidad, int total) {
        try {
            query = "{call AGREGAR_DETALLE_VENTA(?,?,?,?)}";
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setInt(1, idp);
            call.setString(2, fecha);
            call.setInt(3, cantidad);
            call.setInt(4, total);
            call.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error al agregar" + e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(DetalleVentaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
