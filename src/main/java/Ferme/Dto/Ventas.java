package Ferme.Dto;

import java.io.Serializable;

public class Ventas implements Serializable {
      
    public Cliente cliente;
    public DetalleVentas detalle ;
    public Documentos docum;
    public Retiro retiro;
    public Empleado empleado;
    public FormaDePago formapago;
    public int estado;

    public Ventas() {
    }

    public Ventas(Cliente cliente, DetalleVentas detalle, Documentos docum, Retiro retiro, Empleado empleado, FormaDePago formapago, int estado) {
        this.cliente = cliente;
        this.detalle = detalle;
        this.docum = docum;
        this.retiro = retiro;
        this.empleado = empleado;
        this.formapago = formapago;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleVentas getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleVentas detalle) {
        this.detalle = detalle;
    }

    public Documentos getDocum() {
        return docum;
    }

    public void setDocum(Documentos docum) {
        this.docum = docum;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public FormaDePago getFormapago() {
        return formapago;
    }

    public void setFormapago(FormaDePago formapago) {
        this.formapago = formapago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
