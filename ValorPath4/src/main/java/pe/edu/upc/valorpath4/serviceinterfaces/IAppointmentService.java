package pe.edu.upc.valorpath4.serviceinterfaces;

import pe.edu.upc.valorpath4.entities.Appointment;

import java.util.List;

public interface IAppointmentService {
    public void insert (Appointment appointment);
    public void update (Appointment appointment);
    public void delete (int id);
    public List<Appointment> list();
    public Appointment listId (int id);
    public List<String[]> cantidadCitas();
}