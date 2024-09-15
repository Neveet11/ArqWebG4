package pe.edu.upc.valorpath4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpath4.entities.Forum;

import java.util.List;

@Repository
public interface IForumRepository extends JpaRepository<Forum, Integer> {
}
