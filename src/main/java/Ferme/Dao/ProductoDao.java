package Ferme.Dao;

import Ferme.Dto.Producto;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao implements Crud {
    Producto prod = new Producto();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";
    
    @Override
    public List<Producto> Listar() {
        
        List<Producto> lis = new ArrayList();
        query="select * from producto";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            rs=call.executeQuery();
            while (rs.next()) {
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecioUni(rs.getInt("preciouni"));
                prod.setRutaDoc(rs.getString("rutadoc"));
                prod.setStock(rs.getInt("stock"));
                lis.add(prod);
                System.out.println("loco aca empieza el producto dao");
                System.out.println(lis.toString());
                System.out.println("aca termina el producto dao ");
            }
        } catch (SQLException e) {
            System.out.println("error producto dao "+e.getMessage());
        }
        return lis;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
