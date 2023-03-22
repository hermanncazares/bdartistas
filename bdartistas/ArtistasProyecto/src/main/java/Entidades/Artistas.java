package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hermmann Cazares
 */

@Entity
@Table(name = "Artistas")
public class Artistas implements Serializable {

    public Artistas(){
    }

    public Artistas(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    @Id
    @Column(name = "idArtista")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Genero")
    private String genero;
    
    @OneToMany(mappedBy = "artistas", cascade = {CascadeType.ALL})
    private List<Canciones> Canciones;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public List<Canciones> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<Canciones> Canciones) {
        this.Canciones = Canciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Artistas)) {
            return false;
        }
        Artistas other = (Artistas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Artistas{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", Canciones=" + Canciones + '}';
    }
}
