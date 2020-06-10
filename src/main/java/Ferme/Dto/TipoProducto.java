package Ferme.Dto;

import java.io.Serializable;

public class TipoProducto implements Serializable {

    public String nombreTipoProducto;

    public TipoProducto() {
    }

    public TipoProducto(String nombreTipoProducto) {
        this.nombreTipoProducto = nombreTipoProducto;
    }

    public String getNombreTipoProducto() {
        return nombreTipoProducto;
    }

    public void setNombreTipoProducto(String nombreTipoProducto) {
        this.nombreTipoProducto = nombreTipoProducto;
    }

}
