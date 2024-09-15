package pe.edu.upc.valorpath4.dtos;

import pe.edu.upc.valorpath4.entities.Users;

public class RolDTO {

    private Long id_role;
    private String role;
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }
}
