package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionBD implements IConexionBD {
    private EntityManagerFactory enti;
    private EntityManager entity;
    
    @Override
    public EntityManager crearConexion(){
         enti = Persistence.createEntityManagerFactory("conexion");
         entity = enti.createEntityManager(); 
         return entity;
    }
}
