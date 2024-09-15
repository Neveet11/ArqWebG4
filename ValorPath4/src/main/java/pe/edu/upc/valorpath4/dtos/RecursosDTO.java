package pe.edu.upc.valorpath4.dtos;

public class RecursosDTO {
    private int idrecursos;
    private String tiporecursos;
    private String descripcionrecursos;
    public RecursosDTO() {}

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
}
