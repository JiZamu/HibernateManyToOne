package unimanytoone.model;

public class Televisiva {
    private Integer idTelevisiva;
    private String nombre;

    public Televisiva() {
    }

    public Televisiva(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTelevisiva() {
        return idTelevisiva;
    }

    public void setIdTelevisiva(Integer idTelevisiva) {
        this.idTelevisiva = idTelevisiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
