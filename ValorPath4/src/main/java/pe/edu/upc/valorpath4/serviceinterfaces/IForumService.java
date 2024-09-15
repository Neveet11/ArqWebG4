package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Forum;

import java.util.List;

public interface IForumService {
    public void insert(Forum fo);

    public void update(Forum fo);

    public void delete(int id);

    public List<Forum> list();

    public Forum listId(int id);


}
