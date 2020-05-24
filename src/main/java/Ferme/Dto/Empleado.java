package Ferme.Dto;

import java.io.Serializable;

public class Empleado implements Serializable {

    public int estado;
    public String runEmpleado;
    public String digitoVerificador;
    public String nombre;
    public String apellido;
    public String correo;
    public String contrasena;
    public Sucursal sucursal;
    public Direccion direccion;

    public Empleado() {
    }

    
    public Empleado(int estado, String runEmpleado, String digitoVerificador, String nombre, String apellido, String correo, String contrasena, Sucursal sucursal, Direccion direccion) {
        this.estado = estado;
        this.runEmpleado = runEmpleado;
        this.digitoVerificador = digitoVerificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRunEmpleado() {
        return runEmpleado;
    }

    public void setRunEmpleado(String runEmpleado) {
        this.runEmpleado = runEmpleado;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
       
}