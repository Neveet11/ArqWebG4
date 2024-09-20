package pe.edu.upc.valorpathg4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4.entities.Resource;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IResourceRepository extends JpaRepository <Resource, Integer       > {

    @Query(value = "SELECT r.resourcetype AS recurso,COUNT(ur.id) AS total_usos\n" +
            "FROM recursos r\n" +
            "LEFT JOIN uso_recursos ur ON r.id = ur.id\n" +
            "GROUP BY r.id\n" +
            "HAVING total_usos = 0 OR total_usos IS NULL\n" +
            "ORDER BY total_usos ASC",nativeQuery = true)
    List<String[]> Rmenosutilizado();

    @Query(value = "SELECT r.resourcetype AS recurso, COUNT(ur.id) AS total_usos " +
            "FROM recursos r " +
            "JOIN uso_recursos ur ON r.id = ur.id " +
            "WHERE ur.fecha BETWEEN :fechaInicio AND :fechaFin " +
            "GROUP BY r.id " +
            "ORDER BY total_usos DESC ", nativeQuery = true)
    List<String[]> tiporecursomasutilizado(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechaFin") LocalDate fechaFin);
}
