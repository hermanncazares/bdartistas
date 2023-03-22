package Negocio;

import Entidades.Artistas;
import java.util.List;

/**
 *
 * @author Hermmann Cazares
 */
public interface IArtistaNegocio {
    public Artistas agregaArtista(Artistas artista);
    public List<Artistas> agregaArtistaLista(List<Artistas> arti);
    public List<Artistas> obtenerLista();
    public List<Artistas> obtenerListaFiltro(String filtro);
    public List<Artistas> obtenerListaFiltro(String filtro,int limit,int offset);
}
