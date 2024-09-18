package pe.edu.upc.valorpathg4.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.valorpathg4.entities.Forum;
import pe.edu.upc.valorpathg4.entities.Post;
import pe.edu.upc.valorpathg4.repositories.IForumRepository;
import pe.edu.upc.valorpathg4.repositories.IPostRepository;
import pe.edu.upc.valorpathg4.servicesinterfaces.IForumService;

import java.util.List;


@Service

public class ForumServiceImplement implements IForumService {
    @Autowired
    private IForumRepository fR;

    @Override
    public void insert(Forum forum) {
        fR.save(forum);
    }

    @Override
    public void update(Forum forum) {
        fR.save(forum);
    }

    @Override
    public void delete(int id) {
        fR.deleteById(id);
    }

    @Override
    public List<Forum> list() {

        return fR.findAll();
    }

    @Override
    public Forum listId(int id) {
        return fR.findById(id).orElse(new Forum());
    }

    @Override
    public List<String[]> ForosMasActivosEnElEltimoMes() {
        return fR.mostActiveForumsInTheLastMonth();
    }

    @Override
    public List<String[]> CantidadDeForosQueTieneUnPsicologo() {
        return fR.quantityForumsByPsichologyst();
    }
}

