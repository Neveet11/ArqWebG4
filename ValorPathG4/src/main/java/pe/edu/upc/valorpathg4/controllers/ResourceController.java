package pe.edu.upc.valorpathg4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpathg4.dtos.ResourceDTO;
import pe.edu.upc.valorpathg4.entities.Resource;
import pe.edu.upc.valorpathg4.servicesinterfaces.IResourceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class ResourceController {

    @Autowired
    private IResourceService rS;

    @GetMapping
    public List<Resource> listarecursos()
    {
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Resource.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ResourceDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Resource r=m.map(dto,Resource.class);
        rS.insert(r);
    }


}
