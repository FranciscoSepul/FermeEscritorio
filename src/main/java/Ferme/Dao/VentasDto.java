package Ferme.Dao;

import Ferme.Dto.Ventas;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDto implements Crud {

    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        ArrayList list = new ArrayList();
        query = "select * from ventas";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
//            call.registerOutParameter(1, OracleTypes.CURSOR);
            
            rs = call.executeQuery();

            while (rs.next()) {
                Ventas ven = new Ventas();
                ven.setFormaPago(rs.getInt("idformapago"));             
                System.out.println("forma pago"+ven.formaPago);

                list.add(ven);
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

}
