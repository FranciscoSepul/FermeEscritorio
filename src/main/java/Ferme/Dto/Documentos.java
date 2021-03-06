package Ferme.Dto;

import java.io.Serializable;

public class Documentos implements Serializable {

    public String fecha;
    public TipoDocumento tipoDoc;
    public int numFolio;

    public Documentos() {
    }

    public Documentos(String fecha, TipoDocumento tipoDoc, int numFolio) {
        this.fecha = fecha;
        this.tipoDoc = tipoDoc;
        this.numFolio = numFolio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TipoDocumento getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDocumento tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(int numFolio) {
        this.numFolio = numFolio;
    }



}
