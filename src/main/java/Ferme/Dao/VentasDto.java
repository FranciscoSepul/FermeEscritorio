package Ferme.Dao;

import Ferme.Dto.Ventas;
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

public class VentasDto implements Crud {

    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        ArrayList list = new ArrayList();
        query = "{call LISTARTODASVENTAS(?)}";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            rs = (ResultSet) call.getObject(1);
            
            while (rs.next()) {
                
                Ventas ven = new Ventas();
                ven.setFormaPago(rs.getInt("idformapago"));
                list.add(ven);
            }
        } catch (SQLException e) {
            System.out.println("error al listar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(VentasDto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
