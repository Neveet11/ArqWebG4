package pe.edu.upc.valorpath4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpath4.dtos.ForumDTO;
import pe.edu.upc.valorpath4.entities.Forum;
import pe.edu.upc.valorpath4.serviceinterfaces.IForumService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForumController {
    @Autowired
    private IForumService fS;

    @PostMapping("/registrar")
    public void insertar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum f = m.map(dto,Forum.class);
        fS.insert(f);
    }

    @PutMapping("Actualizar")
    public void modificar(@RequestBody ForumDTO dto) {
        ModelMapper m = new ModelMapper();
        Forum f = m.map(dto, Forum.class);
        fS.update(f);
    }

    @GetMapping("/listar")
    public List<ForumDTO> listarforos()
    {
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ForumDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        fS.delete(id);
    }

    @GetMapping("/listar/{id}")
    public ForumDTO listarporId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ForumDTO dto = m.map(fS.listId(id), ForumDTO.class);
        return dto;
    }

}
