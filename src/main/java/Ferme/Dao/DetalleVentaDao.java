package Ferme.Dao;

import Ferme.Dto.*;
import FermeEscritoriodb.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DetalleVentaDao implements Crud {
    
    @Override
    public List Listar() {
        ArrayList list = new ArrayList();
        String query = "Select * from detalleventa";
        try (PreparedStatement busc = Conexion.getConexion().prepareStatement(query))
        {
            ResultSet rs = busc.executeQuery();
            while (rs.next())
            {
                DetalleVentas dev = new DetalleVentas();
                dev.setCantidad(rs.getInt("Cantidad"));
                dev.setFechaCompra(rs.getString("FechaCompra"));
                dev.setTotal(rs.getInt("Total"));
                list.add(dev);
            }
        } catch (Exception e)
        {
            System.out.println("error al listar" + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
