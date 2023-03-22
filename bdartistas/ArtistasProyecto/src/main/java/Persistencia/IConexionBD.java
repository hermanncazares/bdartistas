package Persistencia;

import java.sql.Connection;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author Hermmann Cazares
 */
public interface IConexionBD {

    public EntityManager crearConexion();
}
