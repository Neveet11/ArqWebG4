package pe.edu.upc.valorpathg4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4.entities.UseResources;

import java.util.List;

@Repository
public interface IUseResourcesRepository extends JpaRepository<UseResources,Integer> {

}
