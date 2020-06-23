package Ferme.Dao;

import Ferme.Dto.Producto;
import Ferme.Dto.Sucursal;
import Ferme.Dto.TipoProducto;
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

public class ProductoDao implements Crud {

    Producto prod = new Producto();
    Sucursal suc = new Sucursal();
    TipoProducto tprod = new TipoProducto();
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
                produc.setId(rs.getInt("id"));
                produc.setNombre(rs.getString("nombre"));
                produc.setPrecioUni(rs.getInt("preciouni"));
                produc.setRutaDoc(rs.getString("rutadoc"));
                produc.setStock(rs.getInt("stock"));
                list.add(cont, produc);
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Producto BuscarProducto(int id) {

        try {
            query = "{call LISTARPRODUCTOS(?,?)}";
            con = Conexion.getConexion();

            call = con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.setInt(2, id);
            call.execute();

            rs = (ResultSet) call.getObject(1);

            while (rs.next()) {
                prod.setId(rs.getInt("id"));
                tprod.setNombreTipoProducto(rs.getString("nombretipoproducto"));
                suc.setNombre(rs.getString("NOMBRES"));
                suc.setNumFono(rs.getString("telefono"));
                prod.setNombre(rs.getString("nombre"));
                prod.setStock(rs.getInt("stock"));
                prod.setPrecioUni(rs.getInt("preciouni"));
                prod.setRutaDoc(rs.getString("rutadoc"));
                prod.setTipoProducto(tprod);
                prod.setSucursal(suc);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar" + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prod;
    }

    public boolean modificarPrecio(String precio, String nombre) {
        query = "update producto set preciouni = ? where nombre = ?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, precio);
            call.setString(2, nombre);
            rs = call.executeQuery();
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean modificarStock(String stock, String nombre) {
        query = "update producto set stock = ? where nombre = ?";
        try {
            con = Conexion.getConexion();
            call = con.prepareCall(query);
            call.setString(1, stock);
            call.setString(2, nombre);
            rs = call.executeQuery();
        } catch (SQLException e) {
            System.out.println("error producto dao " + e.getMessage());
            return false;
        } catch (IOException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean desabilitar(String rut, String dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
