
package Ferme.Dto;

import java.io.Serializable;

public class FormaDePago implements Serializable {
    
    public int efectivo ;
    public int debito;
    public int tarjeta;
    public int pagoonline;

     public FormaDePago() {
    }
    
    public FormaDePago(int efectivo, int debito, int tarjeta, int pagoonline) {
        this.efectivo = efectivo;
        this.debito = debito;
        this.tarjeta = tarjeta;
        this.pagoonline = pagoonline;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public int getDebito() {
        return debito;
    }

    public void setDebito(int debito) {
        this.debito = debito;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getPagoonline() {
        return pagoonline;
    }

    public void setPagoonline(int pagoonline) {
        this.pagoonline = pagoonline;
    }

   
    
}
