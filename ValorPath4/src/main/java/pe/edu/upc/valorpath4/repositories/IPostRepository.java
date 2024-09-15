package pe.edu.upc.valorpath4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpath4.entities.Post;

@Repository
public interface IPostRepository extends JpaRepository<Post, Integer> {
}
