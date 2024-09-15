package pe.edu.upc.valorpath4.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Recursos")
public class Recursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrecursos;
    @Column(name = "tiporecursos",length = 50,nullable = false)
    private String tiporecursos;
    @Column(name="descripcionrecursos",length = 400,nullable = false)
    private String descripcionrecursos;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users use;

    public Recursos() {}

    public Recursos(int idrecursos, String tiporecursos, String descripcionrecursos, Users use) {
        this.idrecursos = idrecursos;
        this.tiporecursos = tiporecursos;
        this.descripcionrecursos = descripcionrecursos;
        this.use = use;
    }

    public int getIdrecursos() {
        return idrecursos;
    }

    public void setIdrecursos(int idrecursos) {
        this.idrecursos = idrecursos;
    }

    public String getTiporecursos() {
        return tiporecursos;
    }

    public void setTiporecursos(String tiporecursos) {
        this.tiporecursos = tiporecursos;
    }

    public String getDescripcionrecursos() {
        return descripcionrecursos;
    }

    public void setDescripcionrecursos(String descripcionrecursos) {
        this.descripcionrecursos = descripcionrecursos;
    }

    public Users getUse() {return use;}
    public void setUse(Users use) {this.use = use;}
}
