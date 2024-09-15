package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, length = 50)
    private String comment;
    @Column(nullable = false)
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users user;

    public Post() {
    }

    public Post(int id, String title, String comment, LocalDate date, Users user) {
        this.id = id;
        this.title = title;
        this.comment = comment;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
