package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Evento;

import java.util.List;

public interface IEventoService {
    public List<Evento> list();
    public void insert(Evento e);
    public Evento listId(int id);
    public void delete(int id);
    public void update(Evento e);
    public List<Evento>buscar(String nombre);
}
