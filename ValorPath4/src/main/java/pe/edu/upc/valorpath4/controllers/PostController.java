package pe.edu.upc.valorpath4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpath4.dtos.PostDTO;
import pe.edu.upc.valorpath4.entities.Post;
import pe.edu.upc.valorpath4.serviceinterfaces.IPostService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicar")
public class PostController {
    @Autowired
    private IPostService pS;

    @PostMapping("/registrar")
    public void registrar(@RequestBody PostDTO postDTO) {
        ModelMapper m = new ModelMapper();
        Post post = m.map(postDTO, Post.class);
        pS.insert(post);
    }

    @PutMapping("/actualizar")
    public void modificar(@RequestBody PostDTO postDTO) {
        ModelMapper m = new ModelMapper();
        Post post = m.map(postDTO, Post.class);
        pS.update(post);
    }

    @GetMapping("/listar")
    public List<PostDTO> listar() {
        return pS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, PostDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/listar/{id}")
    public PostDTO listarPorId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PostDTO postDTO = m.map(pS.listId(id), PostDTO.class);
        return postDTO;
    }
}
