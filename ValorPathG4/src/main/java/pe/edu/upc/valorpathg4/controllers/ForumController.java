package pe.edu.upc.valorpathg4.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpathg4.dtos.ForumDTO;
import pe.edu.upc.valorpathg4.dtos.MostActiveForumsInTheLastMonthDTO;
import pe.edu.upc.valorpathg4.dtos.QuantityForumsByPsychologistDTO;
import pe.edu.upc.valorpathg4.dtos.QuantityPostsByVeteranDTO;
import pe.edu.upc.valorpathg4.entities.Forum;
import pe.edu.upc.valorpathg4.servicesinterfaces.IForumService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForumController {
    @Autowired
    private IForumService fS;
    @PostMapping("/registrar")
    @PreAuthorize("hasAnyAuthority('VETERANO','PSICOLOGO')")
    public void registrar(@RequestBody ForumDTO forumDTO) {
        ModelMapper m = new ModelMapper();
        Forum forum = m.map(forumDTO, Forum.class);
        fS.insert(forum);
    }

    @PutMapping("/actualizar")
    public void modificar(@RequestBody ForumDTO forumDTO) {
        ModelMapper m = new ModelMapper();
        Forum forum = m.map(forumDTO, Forum.class);
        fS.update(forum);
    }

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('VETERANO')")
    public List<ForumDTO> listar() {
        return fS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ForumDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        fS.delete(id);
    }

    @GetMapping("/listar/{id}")
    public ForumDTO listarPorId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ForumDTO forumDTO = m.map(fS.listId(id), ForumDTO.class);
        return forumDTO;
    }
    @GetMapping("/quantity(MostActiveForums)")
    public List<MostActiveForumsInTheLastMonthDTO> mostActiveForumsInTheLastMonths(){
        List<String[]> list = fS.ForosMasActivosEnElEltimoMes();
        List<MostActiveForumsInTheLastMonthDTO> listdto = new ArrayList<>();
        for(String[] columna : list){
            MostActiveForumsInTheLastMonthDTO dto = new MostActiveForumsInTheLastMonthDTO();
            dto.setId(Integer.parseInt(columna[0]));
            dto.setTitle(columna[1]);
            dto.setNumPosts(Integer.parseInt(columna[2]));
            listdto.add(dto);
        }
        return listdto;
    }
    @GetMapping("/quantity(ForumsByPsy)")
    public List<QuantityForumsByPsychologistDTO> q(){
        List<String[]> list = fS.CantidadDeForosQueTieneUnPsicologo ();
        List<QuantityForumsByPsychologistDTO> listdto = new ArrayList<>();
        for(String[] columna : list){
            QuantityForumsByPsychologistDTO dto = new QuantityForumsByPsychologistDTO();
            dto.setUsername(columna[0]);
            dto.setPsychologistLastName(columna[1]);
            dto.setForumCount(Integer.parseInt(columna[2]));
            listdto.add(dto);
        }
        return listdto;
    }
}
