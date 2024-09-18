package pe.edu.upc.valorpathg4.servicesimplements;


import org.springframework.stereotype.Service;

import pe.edu.upc.valorpathg4.entities.Forum;
import pe.edu.upc.valorpathg4.servicesinterfaces.IForumService;

import java.util.List;


@Service

public class ForumServiceImplement implements IForumService {

    @Override
    public void insert(Forum forum) {

    }

    @Override
    public void update(Forum forum) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Forum> list() {
        return List.of();
    }

    @Override
    public Forum listId(int id) {
        return null;
    }
}
