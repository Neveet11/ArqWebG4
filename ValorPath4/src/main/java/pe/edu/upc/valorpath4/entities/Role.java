package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_role;
    private String rol;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users user;

    public Role() {
    }

    public Role(Long id_role, String rol, Users user) {
        this.id_role = id_role;
        this.rol = rol;
        this.user = user;
    }

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}
