package pe.edu.upc.valorpath4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpath4.entities.Evento;

import java.util.List;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, Integer> {

    @Query("select e from Evento e where e.name like %:nombre%")
    public List<Evento> buscar(@Param("nombre") String nombre);
}
