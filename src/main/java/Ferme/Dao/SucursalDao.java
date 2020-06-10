package Ferme.Dao;

import Ferme.Dto.Sucursal;
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

public class SucursalDao implements Crud {

    Sucursal suc = new Sucursal();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        ArrayList list = new ArrayList();
        query = "select * from sucursal";
        try {
            con = Conexion.getConexion();
        } catch (IOException ex) {
            Logger.getLogger(SucursalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            call = con.prepareCall(query);
            rs = call.executeQuery();
            while (rs.next()) {
                suc.setDireccion(rs.getInt("iddireccion"));
                suc.setNombre(rs.getString("nombres"));
                suc.setNumFono(rs.getString("telefono"));
                list.add(suc);
            }
        } catch (SQLException e) {
            System.out.println("fallo el listar sucursal" + e.getMessage());
        }

        return list;
    }
       public Sucursal buscar(String nombres) throws IOException{
        query = "select * from sucursal where nombres=?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, nombres);
            rs = call.executeQuery();         
            while(rs.next()){
            suc.setDireccion(rs.getInt("iddireccion"));
            suc.setNombre(rs.getString("nombres"));
            suc.setNumFono(rs.getString("telefono"));
            suc.setIddirec(rs.getInt("id"));
            }
             } catch (SQLException e) {
            System.out.println("error al agregar una direccionr" + e.getMessage());
             }
        return suc;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
