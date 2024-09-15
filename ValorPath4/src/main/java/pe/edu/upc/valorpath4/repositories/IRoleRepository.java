package pe.edu.upc.valorpath4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpath4.entities.Role;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer>{

    @Query("Select r from Role r where r.rol like %:nombre%")
    public List<Role> buscar(@Param("nombre") String nombre);

}
