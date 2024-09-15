package pe.edu.upc.valorpath4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.valorpath4.entities.Appointment;

import java.util.List;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
    @Query(value = " select a.name as nameappointment, \n" +
            "count(*)as quantityUsuarios \n" +
            "FROM appointment a \n" +
            "join users u \n" +
            "on a.id_user = u.id_users \n" +
            "GROUP BY a.name ",nativeQuery = true)
    public List<String[]> cantidadUsersPorCitas();
}
