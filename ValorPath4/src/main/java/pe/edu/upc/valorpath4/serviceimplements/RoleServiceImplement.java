package pe.edu.upc.valorpath4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpath4.entities.Role;
import pe.edu.upc.valorpath4.repositories.IRoleRepository;
import pe.edu.upc.valorpath4.serviceinterfaces.IRoleService;

import java.util.List;
@Service

public class RoleServiceImplement implements IRoleService {

    @Autowired
    private IRoleRepository rR;

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public Role listId(int id) {
        return rR.findById(id).orElse(new Role());
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public void update(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> buscar(String nombre) {
        return rR.buscar(nombre);
    }
}
