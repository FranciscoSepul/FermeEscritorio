package Ferme.Dao;

import FermeEscritoriodb.Conexion;
import Ferme.Dto.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

public class DocumentosDao implements Crud {
    
    Documentos doc = new Documentos();
    TipoDocumento tdoc = new TipoDocumento();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        
        ArrayList list = new ArrayList();
        query = "{call LISTARTODOSDOCUMENTOS(?)}";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                tdoc.setNombre(rs.getString("nombre"));
                doc.setNumFolio(rs.getInt("numfolio"));
                doc.setFecha(rs.getString("fecha"));
                doc.setTipoDoc(tdoc);
                
                list.add(doc);
            }
        } catch (SQLException e) {
            System.out.println("error al listar" + e.getMessage());
        }
        return list;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
