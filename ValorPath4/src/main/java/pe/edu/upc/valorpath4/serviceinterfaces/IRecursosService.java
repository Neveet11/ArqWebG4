package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Recursos;

import java.util.List;

public interface IRecursosService {
    public List<Recursos> list();
    public void insert(Recursos recurso);
}
