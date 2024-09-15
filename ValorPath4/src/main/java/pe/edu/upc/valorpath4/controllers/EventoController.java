package pe.edu.upc.valorpath4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.valorpath4.dtos.EventoDTO;
import pe.edu.upc.valorpath4.entities.Evento;
import pe.edu.upc.valorpath4.serviceinterfaces.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private IEventoService eS;
    @GetMapping
    public List<EventoDTO> listar() {
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EventoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EventoDTO edto) {
        ModelMapper m = new ModelMapper();
        Evento e= m.map(edto, Evento.class);
        eS.insert(e);
    }

    @GetMapping("/{id}")
    public EventoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EventoDTO edto =m.map(eS.listId(id), EventoDTO.class);
        return edto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody EventoDTO edto) {
        ModelMapper m = new ModelMapper();
        Evento e= m.map(edto, Evento.class);
        eS.update(e);
    }

    @GetMapping("/busquedas")
    public List<EventoDTO> BuscarEvento(@RequestParam String n) {
        return eS.buscar(n).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EventoDTO.class);
        }).collect(Collectors.toList());
    }
}
