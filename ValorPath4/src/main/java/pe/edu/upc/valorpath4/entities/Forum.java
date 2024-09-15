package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idforum;
    @Column(name = "title", nullable = false, length = 60)
    private String title;
    @Column(name = "description", nullable = false, length = 80)
    private String description;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users us;

    public Forum() {
    }

    public Forum(int idforum, String title, String description, LocalDate date, Users us) {
        this.idforum = idforum;
        this.title = title;
        this.description = description;
        this.date = date;
        this.us = us;
    }

    public int getIdforum() {
        return idforum;
    }

    public void setIdforum(int idforum) {
        this.idforum = idforum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
