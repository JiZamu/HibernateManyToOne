package unimanytoone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "TELEVIDENTEA")
public class Televidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TELEVIDENTE")
    private Integer idTelevidente;
    @Column(name = "NOMBRE")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "ID_TELEVISIVA")
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
