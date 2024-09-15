package pe.edu.upc.valorpath4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpath4.entities.Forum;
import pe.edu.upc.valorpath4.repositories.IForumRepository;
import pe.edu.upc.valorpath4.serviceinterfaces.IForumService;

import java.util.List;

@Service

public class ForumServiceImplement implements IForumService {
    @Autowired
    private IForumRepository fR;

    @Override
    public List<Forum> list() {
        return fR.findAll();
    }

    @Override
    public void insert(Forum fo) {
        fR.save(fo);

    }

    @Override
    public void update(Forum fo) {
        fR.save(fo);
    }

    @Override
    public void delete(int id) {
        fR.deleteById(id);
    }

    @Override
    public Forum listId(int id) {
        return fR.findById(id).orElse(new Forum());
    }

}
