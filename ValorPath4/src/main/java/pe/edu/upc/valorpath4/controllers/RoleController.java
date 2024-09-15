package pe.edu.upc.valorpath4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpath4.dtos.RolDTO;
import pe.edu.upc.valorpath4.entities.Role;
import pe.edu.upc.valorpath4.serviceinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService rS;

    @GetMapping
    public List<RolDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RolDTO dto =m.map(rS.listId(id), RolDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.update(r);
    }

    @GetMapping("/busquedas")
    public List<RolDTO> buscarRol(@RequestParam String n){

        return rS.buscar(n).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());

    }
}
