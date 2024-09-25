package pe.edu.upc.valorpathg4.servicesinterfaces;

import pe.edu.upc.valorpathg4.entities.Event;

import java.util.List;

public interface IEventService {

    public List<Event> list();
    public void insert(Event e);
    public void delete(int id);
    public void update(Event e);
    public List<String[]>eventosultimomes();
    public List<String[]>eventoPorPsicologo();

}
