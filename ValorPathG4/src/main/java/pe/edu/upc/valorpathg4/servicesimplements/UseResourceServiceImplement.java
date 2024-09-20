package pe.edu.upc.valorpathg4.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.valorpathg4.entities.UseResources;
import pe.edu.upc.valorpathg4.repositories.IUseResourcesRepository;
import pe.edu.upc.valorpathg4.servicesinterfaces.IUseResourceService;

import java.util.List;
@Service
public class UseResourceServiceImplement implements IUseResourceService {
    @Autowired
    private IUseResourcesRepository iur;

    @Override
    public List<UseResources> listaruso() {
        return iur.findAll();
    }
}
