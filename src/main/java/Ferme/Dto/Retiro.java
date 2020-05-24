package Ferme.Dto;

import java.io.Serializable;

public class Retiro implements Serializable {

    public String nombreRetiro;

    public Retiro() {
    }

    public Retiro(String nombreRetiro) {
        this.nombreRetiro = nombreRetiro;
    }

    public String getNombreRetiro() {
        return nombreRetiro;
    }

    public void setNombreRetiro(String nombreRetiro) {
        this.nombreRetiro = nombreRetiro;
    }

    

}
