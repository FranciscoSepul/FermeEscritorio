package Ferme.Dto;

import java.io.Serializable;

public class Producto implements Serializable {

    public String nombre;
    public int stock;
    public int precioUni;
    public String rutaDoc;

    public Producto() {
    }

    public Producto(String nombre, int stock, int precioUni, String rutaDoc) {
        this.nombre = nombre;
        this.stock = stock;
        this.precioUni = precioUni;
        this.rutaDoc = rutaDoc;
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

    public String getRutaDoc() {
        return rutaDoc;
    }

    public void setRutaDoc(String rutaDoc) {
        this.rutaDoc = rutaDoc;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", stock=" + stock + ", precioUni=" + precioUni + ", rutaDoc=" + rutaDoc + '}';
    }
    
    

}
