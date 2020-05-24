package Ferme.Dto;

import java.io.Serializable;

public class Proveedor implements Serializable {

    public String rutEmpresa;
    public String runProveedor;
    public String digitoVerif;
    public int estado;
    public String nombre;
    public String numeroTelef;
    public String direccion;
    public String correo;
    public Empresa empresa;

    public Proveedor() {
    }

    public Proveedor(String rutEmpresa, String runProveedor, String digitoVerif, int estado, String nombre, String numeroTelef, String direccion, String correo, Empresa empresa) {
        this.rutEmpresa = rutEmpresa;
        this.runProveedor = runProveedor;
        this.digitoVerif = digitoVerif;
        this.estado = estado;
        this.nombre = nombre;
        this.numeroTelef = numeroTelef;
        this.direccion = direccion;
        this.correo = correo;
        this.empresa = empresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getRunProveedor() {
        return runProveedor;
    }

    public void setRunProveedor(String runProveedor) {
        this.runProveedor = runProveedor;
    }

    public String getDigitoVerif() {
        return digitoVerif;
    }

    public void setDigitoVerif(String digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelef() {
        return numeroTelef;
    }

    public void setNumeroTelef(String numeroTelef) {
        this.numeroTelef = numeroTelef;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
