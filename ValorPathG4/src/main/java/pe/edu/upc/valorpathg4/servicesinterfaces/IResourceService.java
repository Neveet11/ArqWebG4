package pe.edu.upc.valorpathg4.servicesinterfaces;

import pe.edu.upc.valorpathg4.entities.Resource;

import java.util.List;

public interface IResourceService {
    public List<Resource> list();
    public void insert(Resource resour);
}
