package Ferme.Dto;

import java.io.Serializable;

public class Direccion implements Serializable {

    public int region;
    public int idDire;
    public String comuna;
    public String pasaje;
    public String numero;
    public String numeroDepto;

    public Direccion() {
    }

    public Direccion(int region, int idDire, String comuna, String pasaje, String numero, String numeroDepto) {
        this.region = region;
        this.idDire = idDire;
        this.comuna = comuna;
        this.pasaje = pasaje;
        this.numero = numero;
        this.numeroDepto = numeroDepto;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getIdDire() {
        return idDire;
    }

    public void setIdDire(int idDire) {
        this.idDire = idDire;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getPasaje() {
        return pasaje;
    }

    public void setPasaje(String pasaje) {
        this.pasaje = pasaje;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroDepto() {
        return numeroDepto;
    }

    public void setNumeroDepto(String numeroDepto) {
        this.numeroDepto = numeroDepto;
    }

    

}
