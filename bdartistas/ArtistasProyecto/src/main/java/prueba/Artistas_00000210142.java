package prueba;

import Negocio.ArtistasNegocio;
import Negocio.IArtistaNegocio;
import Persistencia.ArtistaDAO;
import Persistencia.ConexionBD;
import Persistencia.IArtistaDAO;
import Persistencia.IConexionBD;
import frm.frmInicio;

/**
 *
 * @author Hermmann Cazares
 */
public class Artistas_00000210142 {

    public static void main(String[] args) {
        IConexionBD con = new ConexionBD();
        
        IArtistaDAO artista = new ArtistaDAO(con);
        IArtistaNegocio artistaNegocio = new ArtistasNegocio(artista);
        frmInicio pantallaInicial = new frmInicio(artistaNegocio);
        
        pantallaInicial.setVisible(true);
    }
}
