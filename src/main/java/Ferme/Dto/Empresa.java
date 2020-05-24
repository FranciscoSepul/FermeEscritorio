package Ferme.Dto;

public class Empresa {

    public String rutEmpresa;
    public String dvRut;
    public String nombreEmpresa;
    public String correoE;
    public String numeroTelf;

    public Empresa() {
    }

    public Empresa(String rutEmpresa, String dvRut, String nombreEmpresa, String correoE, String numeroTelf) {
        this.rutEmpresa = rutEmpresa;
        this.dvRut = dvRut;
        this.nombreEmpresa = nombreEmpresa;
        this.correoE = correoE;
        this.numeroTelf = numeroTelf;
    }
    
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getDvRut() {
        return dvRut;
    }

    public void setDvRut(String dvRut) {
        this.dvRut = dvRut;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getNumeroTelf() {
        return numeroTelf;
    }

    public void setNumeroTelf(String numeroTelf) {
        this.numeroTelf = numeroTelf;
    }
    
    

}
