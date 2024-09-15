package pe.edu.upc.valorpath4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpath4.entities.Recursos;
import pe.edu.upc.valorpath4.repositories.IRecursosRepository;
import pe.edu.upc.valorpath4.serviceinterfaces.IRecursosService;

import java.util.List;
@Service
public class RecursosImplements implements IRecursosService {

    @Autowired
    private IRecursosRepository rr;

    @Override
    public List<Recursos> list() {
        return rr.findAll();
    }

    @Override
    public void insert(Recursos recurso) {
        rr.save(recurso);
    }
}
