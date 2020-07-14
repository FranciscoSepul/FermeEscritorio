package Ferme.Dto;

import java.io.Serializable;

public class Producto implements Serializable {

    public int id;
    public TipoProducto tipoProducto;
    public Sucursal sucursal;
    public String nombre;
    public int stock;
    public int precioUni;
    public String rutaDoc;

    public Producto() {
    }

    public Producto(int id, TipoProducto tipoProducto, Sucursal sucursal, String nombre, int stock, int precioUni, String rutaDoc) {
        this.id = id;
        this.tipoProducto = tipoProducto;
        this.sucursal = sucursal;
        this.nombre = nombre;
        this.stock = stock;
        this.precioUni = precioUni;
        this.rutaDoc = rutaDoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(int precioUni) {
        this.precioUni = precioUni;
    }



    public void setRutaDoc(String rutaDoc) {
        String rutaImg = "src\\main\\java\\FermePage"+rutaDoc;
        String Formato =rutaImg;
        this.rutaDoc = Formato;
    }
    

    @Override
    public String toString() {
        return "Producto{"+ id +  "tipoProducto=" + tipoProducto + ", sucursal=" + sucursal + ", nombre=" + nombre + ", stock=" + stock + ", precioUni=" + precioUni + ", rutaDoc=" + rutaDoc + '}';
    }
    

}
