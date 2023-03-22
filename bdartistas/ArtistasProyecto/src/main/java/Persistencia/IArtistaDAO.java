package Persistencia;

import Entidades.Artistas;
import java.util.List;

/**
 *
 * @author Hermman Cazares
 */
public interface IArtistaDAO {
    public List<Artistas> ListaArtista();
    public List<Artistas> ListaArtistaFiltro(String filtro,int limit,int offset);
    public List<Artistas> ListaArtistaFiltro(String filtro);
    public boolean agregaArtista(Artistas artista);
    public boolean agregaArtistaLista(List<Artistas> artista);
}
