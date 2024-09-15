package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> list();
    public void insert(Role role);
    public Role listId (int id);
    public void delete(int id);
    public void update(Role role);
    public List<Role> buscar(String nombre);
}
