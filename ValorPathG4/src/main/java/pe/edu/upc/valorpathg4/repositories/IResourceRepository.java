package pe.edu.upc.valorpathg4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4.entities.Resource;

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
}
