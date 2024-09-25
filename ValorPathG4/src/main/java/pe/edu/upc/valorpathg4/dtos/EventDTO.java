package pe.edu.upc.valorpathg4.dtos;

import pe.edu.upc.valorpathg4.entities.EventType;
import pe.edu.upc.valorpathg4.entities.Users;

import java.time.LocalDate;
import java.util.List;

public class EventDTO {

    private int idEvent;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationDate;
    private List<Users> verterano;
    private List<Users> psicologo;
    private EventType eventType;

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Users> getVerterano() {
        return verterano;
    }

    public void setVerterano(List<Users> verterano) {
        this.verterano = verterano;
    }

    public List<Users> getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(List<Users> psicologo) {
        this.psicologo = psicologo;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
