package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.EventType;

import java.util.List;

public interface IEvenTypeService {

    public List<EventType> list();
    public void insert(EventType ety);
    public EventType listId(int id);

    public void delete(int id);

    public void update(EventType ety);

    public List<EventType> buscar(String etype);
}
