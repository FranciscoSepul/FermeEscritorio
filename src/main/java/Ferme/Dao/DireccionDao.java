package Ferme.Dao;

import Ferme.Dto.Direccion;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class DireccionDao implements Crud {

    Direccion direc = new Direccion();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    @Override
    public List Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean agregar(String region,String comuna,String pasaje,String numero,String numeroDepto){
        query = "INSERT INTO DIRECCION (region,comuna,pasaje,numero,numeroDepto) VALUES (?, ?,?,?,?)";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, region);
            call.setString(2,comuna);
            call.setString(3,pasaje);
            call.setString(4,numero);
            call.setString(5,numeroDepto);            
            rs = call.executeQuery();                      
             } catch (Exception e) {
            System.out.println("error al agregar una direccion" + e.getMessage());
            return false;
        }
        return true;
    }
    
    public Direccion buscar(String region,String comuna,String pasaje){
        query = "select * from DIRECCION where region=? and comuna=? and pasaje=?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, region);
            call.setString(2,comuna);
            call.setString(3,pasaje);
            rs = call.executeQuery();         
            while(rs.next()){
                direc.setComuna(rs.getString("comuna"));
                direc.setNumero(rs.getString("numero"));
                direc.setIdDire(rs.getInt("id"));     
            }
             } catch (Exception e) {
            System.out.println("error al buscar  una direccionr" + e.getMessage());
             }
        return direc;
    }

}
