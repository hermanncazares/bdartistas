package Entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hermmann Cazares
 */
@Entity
@Table(name = "Canciones")
public class Canciones implements Serializable {

    public Canciones() {
    }

    public Canciones(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Canciones(String nombre, String duracion, Artistas artista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artistas = artista;
    }

    @Id
    @Column(name = "idCancion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Duracion")
    private String duracion;
    
    @JoinColumn(name = "idArtista", nullable = true)
    private Artistas artistas;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String Duracion) {
        this.duracion = Duracion;
    }

    public Artistas getArtistas() {
        return artistas;
    }

    public void setArtistas(Artistas artistas) {
        this.artistas = artistas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canciones)) {
            return false;
        }
        Canciones other = (Canciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Personaje[ id=" + id + " ]";
    }
}
