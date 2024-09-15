package pe.edu.upc.valorpath4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpath4.entities.Post;
import pe.edu.upc.valorpath4.repositories.IPostRepository;
import pe.edu.upc.valorpath4.serviceinterfaces.IPostService;

import java.util.List;

@Service
public class PostImplement implements IPostService {
    @Autowired
    private IPostRepository pR;

    @Override
    public void insert(Post post) {
        pR.save(post);
    }

    @Override
    public void update(Post post) {
        pR.save(post);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<Post> list() {
        return pR.findAll();
    }

    @Override
    public Post listId(int id) {
        return pR.findById(id).orElse(new Post());
    }
}
