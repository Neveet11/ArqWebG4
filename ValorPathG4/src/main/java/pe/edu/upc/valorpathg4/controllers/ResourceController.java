package pe.edu.upc.valorpathg4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpathg4.dtos.LessUseResourceDTO;
import pe.edu.upc.valorpathg4.dtos.MostUseResourceDTO;
import pe.edu.upc.valorpathg4.dtos.ResourceDTO;
import pe.edu.upc.valorpathg4.entities.Resource;
import pe.edu.upc.valorpathg4.servicesinterfaces.IResourceService;

import java.time.LocalDate;
import java.util.ArrayList;
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

    @GetMapping("/menosutilizado")
    public List<LessUseResourceDTO> Recursomenosutilizado()
    {
        List<String[]> lista=rS.Rmenosutilizado();
        List<LessUseResourceDTO> listdto=new ArrayList<>();
        for(String[] column:lista)
        {
            LessUseResourceDTO dto=new LessUseResourceDTO();
            dto.setTiporecurso(column[0]);
            dto.setTotalusos(Integer.parseInt(column[1]));
            listdto.add(dto);
        }
        return listdto;
    }
    @GetMapping("/maasutilizadoportiempo")
    public List<MostUseResourceDTO> recursomasutilizadoportiempo(@RequestParam LocalDate fechainicio,@RequestParam LocalDate fechafin) {
        List<String[]> lista = rS.tiporecursomasutilizad(fechainicio, fechafin);
        List<MostUseResourceDTO> listadto = new ArrayList<>();
        for (String[] columna : lista) {
            MostUseResourceDTO dto = new MostUseResourceDTO();
            dto.setTiporecurso(columna[0]);
            dto.setTotalusos(Integer.parseInt(columna[1]));
            listadto.add(dto);
        }
        return listadto;
    }


}
