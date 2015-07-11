package unimanytoone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TELEVISIVAA")
public class Televisiva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TELEVISIVA")
    private Integer idTelevisiva;
    @Column(name = "NOMBRE")
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
