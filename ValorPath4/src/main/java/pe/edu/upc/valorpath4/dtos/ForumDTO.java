package pe.edu.upc.valorpath4.dtos;

import pe.edu.upc.valorpath4.entities.Users;

import java.time.LocalDate;

public class ForumDTO {
    private int idForo;
    private String titulo;
    private String descripccion;
    private LocalDate fecha;
    private Users user;

    public int getIdForo() {
        return idForo;
    }

    public void setIdForo(int idForo) {
        this.idForo = idForo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
