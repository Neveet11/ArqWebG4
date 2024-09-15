package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Users;

import java.util.List;

public interface IUsersService {

    public List<Users> list();
    public void insert(Users us);
    public void delete(int id);
    public void update(Users us);
}
