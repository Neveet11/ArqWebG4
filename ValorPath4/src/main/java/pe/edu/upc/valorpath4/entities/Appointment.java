package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointment")
public class Appointment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(nullable = false, length = 50)
    private String name;
@Column(nullable = false)
    private LocalDate date;
@Column(nullable = false)
    private String status;
@ManyToOne
@JoinColumn(name = "idUser")
    private Users user;

    public Appointment() {
    }

    public Appointment(int id, String name, LocalDate date, String status, Users user) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
