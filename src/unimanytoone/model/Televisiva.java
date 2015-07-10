package unimanytoone.model;

public class Televisiva {
    private Integer id;
    private String nombre;

    public Televisiva() {
    }

    public Televisiva(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
