package pe.edu.upc.valorpath4.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpath4.dtos.RecursosDTO;
import pe.edu.upc.valorpath4.entities.Recursos;
import pe.edu.upc.valorpath4.serviceinterfaces.IRecursosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class RecursosController {

    @Autowired
    private IRecursosService rs;

    @GetMapping
    public List<Recursos> listarecursos()
    {
        return rs.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Recursos.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RecursosDTO dto)
    {
        ModelMapper m=new ModelMapper();
        Recursos r=m.map(dto,Recursos.class);
        rs.insert(r);
    }
}
