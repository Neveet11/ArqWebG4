package pe.edu.upc.valorpathg4.servicesimplements;

import pe.edu.upc.valorpathg4.entities.UseResources;
import pe.edu.upc.valorpathg4.repositories.IUseResourcesRepository;
import pe.edu.upc.valorpathg4.servicesinterfaces.IUseResourceService;

import java.util.List;

public class UseResourceServiceImplement implements IUseResourceService {

    private IUseResourcesRepository iur;

    @Override
    public List<UseResources> listaruso() {
        return iur.findAll();
    }
}
