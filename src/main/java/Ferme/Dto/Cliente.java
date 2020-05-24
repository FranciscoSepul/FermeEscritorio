package Ferme.Dto;

import java.io.Serializable;

public class Cliente implements Serializable {

    public String runCliente;
    public String digitoVerif;
    public int estado;
    public String nombre;
    public String apellido;
    public String correo;
    public String contrasena;
    public Direccion direccion;

    public Cliente() {
    }

    public Cliente(String runCliente, String digitoVerif, int estado, String nombre, String apellido, String correo, String contrasena, Direccion direccion) {
        this.runCliente = runCliente;
        this.digitoVerif = digitoVerif;
        this.estado = estado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getRunCliente() {
        return runCliente;
    }

    public void setRunCliente(String runCliente) {
        this.runCliente = runCliente;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Cliente{" + "runCliente=" + runCliente + ", digitoVerif=" + digitoVerif + ", estado=" + estado + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }

}
