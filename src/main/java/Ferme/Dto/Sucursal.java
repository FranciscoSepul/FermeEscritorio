package Ferme.Dto;

import java.io.Serializable;

public class Sucursal implements Serializable {

    public int iddirec;
    public int direccion;
    public String nombre;
    public String numFono;

    public Sucursal() {
    }

    public Sucursal(int iddirec, int direccion, String nombre, String numFono) {
        this.iddirec = iddirec;
        this.direccion = direccion;
        this.nombre = nombre;
        this.numFono = numFono;
    }

    public int getIddirec() {
        return iddirec;
    }

    public void setIddirec(int iddirec) {
        this.iddirec = iddirec;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumFono() {
        return numFono;
    }

    public void setNumFono(String numFono) {
        this.numFono = numFono;
    }

  
    

}
