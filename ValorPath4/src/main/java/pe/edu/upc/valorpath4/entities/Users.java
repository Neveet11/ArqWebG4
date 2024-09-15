package pe.edu.upc.valorpath4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "surnames", nullable = false, length = 50)
    private String surnames;

    @Column(name = "city", nullable = false, length = 20)
    private String city;

    @Column(name = "phone", nullable = false, length = 9)
    private String phone;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "address", nullable = false, length = 60)
    private String address;


    @Column(unique = true, length = 30)
    private String username;

    @Column(length = 300)
    private String password;
    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id")
    private List<Role> roles;

    public Users() {
    }

    public Users(long id_user, String dni, String name, String surnames, String city, String phone, String email, String address, String username, String password, boolean enabled, List<Role> roles) {
        this.id_user = id_user;
        this.dni = dni;
        this.name = name;
        this.surnames = surnames;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
