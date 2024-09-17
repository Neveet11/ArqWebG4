package pe.edu.upc.valorpathg4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpathg4.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
