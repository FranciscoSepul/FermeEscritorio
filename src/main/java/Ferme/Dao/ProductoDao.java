package Ferme.Dao;

import Ferme.Dto.Producto;
import Ferme.Dto.Sucursal;
import Ferme.Dto.TipoProducto;
import FermeEscritoriodb.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao implements Crud {

    Producto prod = new Producto();
    Sucursal suc = new Sucursal();
    TipoProducto tdoc = new TipoProducto();
    ResultSet rs = null;
    Connection con = null;
    CallableStatement call = null;
    String query = "";

    int cont = 0;

    @Override
    public List<Producto> Listar() {

        ArrayList list = new ArrayList();
        query = "select * from producto";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            rs = call.executeQuery();
            while (rs.next()) {
                Producto produc = new Producto();
                produc.setNombre(rs.getString("nombre"));
                produc.setPrecioUni(rs.getInt("preciouni"));
                produc.setRutaDoc(rs.getString("rutadoc"));
                produc.setStock(rs.getInt("stock"));
                list.add(cont, produc);
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
        }
        return list;
    }

    public boolean modificarPrecio(String precio,String nombre){
        query = "update producto set preciouni = ? where nombre = ?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1,precio);
            call.setString(2,nombre);
            rs = call.executeQuery();          
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
            return false;
        }
        return true;
    }
     public boolean modificarStock(String stock,String nombre){
        query = "update producto set stock = ? where nombre = ?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1,stock);
            call.setString(2,nombre);
            rs = call.executeQuery();          
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
            return false;
        }
        return true;
    }
    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public Producto BuscarProductoPorId(int idp){
//         try {
//            query = "{select * from producto where id =? }";
//            con = Conexion.getConexion();
//
//            call = con.prepareCall(query);
////            call.registerOutParameter(1, OracleTypes.CURSOR);
//            call.setInt(1, idp);
//            call.execute();
//
//            rs = (ResultSet) call.getObject(1);
//
//            while (rs.next()) {
//                prod.setId(rs.getInt("id"));
////                tdoc.setNombreTipoProducto(rs.getString("nombretipoproducto"));
//////                suc.setNombre(rs.getString("nombre"));
//////                suc.setNumFono(rs.getString("telefono"));
//////                prod.setTipoProducto(tdoc);
//////                prod.setSucursal(suc);
//                prod.setNombre(rs.getString("nombre"));
//                prod.setStock(rs.getInt("stock"));
//                prod.setPrecioUni(rs.getInt("preciouni"));
//                prod.setRutaDoc(rs.getString("rutadoc"));
//
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al buscar asdf" + e.getMessage());
//        }
//        return prod;
//    }

}
