package Negocio;

import Entidades.Artistas;
import Persistencia.ArtistaDAO;
import java.util.List;
import Persistencia.IArtistaDAO;
/**
 *
 * @author Hermmann Cazares
 */
public class ArtistasNegocio implements IArtistaNegocio{
    private IArtistaDAO artistaDAO;
    public ArtistasNegocio(IArtistaDAO artistaDAO){
        this.artistaDAO= artistaDAO;
    }
    
    @Override
    public Artistas agregaArtista(Artistas artista) {
        if (!artistaDAO.agregaArtista(artista)) {
          return null;  
        }   
       return artista;
    }
    @Override
    public List<Artistas>agregaArtistaLista(List<Artistas> lista) {
        
        if (!artistaDAO.agregaArtistaLista(lista)) {
          return null;  
        }   
       return lista;
    }

    @Override
    public List<Artistas> obtenerLista() {
      List<Artistas>lista = artistaDAO.ListaArtista();
        if (lista==null||lista.isEmpty()) {
            return null;
        }
        return lista;
    }
    @Override
    public List<Artistas> obtenerListaFiltro(String filtro,int limit,int offset) {
      List<Artistas>lista = artistaDAO.ListaArtistaFiltro(filtro, limit, offset);
        if (lista==null||lista.isEmpty()) {
            return null;
        }
        return lista;
    }
    @Override
    public List<Artistas> obtenerListaFiltro(String filtro) {
      List<Artistas>lista = artistaDAO.ListaArtistaFiltro(filtro);
        if (lista==null||lista.isEmpty()) {
            return null;
        }
        return lista;
    }
}
