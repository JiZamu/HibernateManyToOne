package unimanytoone.model;

public class Televidente {
    private Integer idTelevidente;
    private String nombre;
    private Televisiva televisiva;

    public Televidente() {
    }

    public Televidente(String nombre, Televisiva televisiva) {
        this.nombre = nombre;
        this.televisiva = televisiva;
    }

    public Integer getIdTelevidente() {
        return idTelevidente;
    }

    public void setIdTelevidente(Integer idTelevidente) {
        this.idTelevidente = idTelevidente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Televisiva getTelevisiva() {
        return televisiva;
    }

    public void setTelevisiva(Televisiva televisiva) {
        this.televisiva = televisiva;
    }
    
    
}
