package Ferme.Dao;

import java.util.List;

public interface Crud {
    public List Listar();
    public boolean desabilitar(String rut,String dv);
}
