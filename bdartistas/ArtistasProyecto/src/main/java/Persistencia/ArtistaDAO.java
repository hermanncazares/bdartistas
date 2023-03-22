package Persistencia;

import Entidades.Artistas;
import Entidades.Canciones;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author Hermann Cazares
 */
public class ArtistaDAO implements IArtistaDAO {

    private EntityManager entity;

    public ArtistaDAO(IConexionBD cone) {
        this.entity = cone.crearConexion();
    }

    @Override
    public List<Artistas> ListaArtista() {
        entity.getTransaction().begin();
        String queryBuscar = "Select v From Artistas v";
        TypedQuery<Artistas> query = entity.createQuery(queryBuscar, Artistas.class);
        List<Artistas> lista = query.getResultList();
        entity.getTransaction().commit();
        return lista;
    }

    @Override
    public List<Artistas> ListaArtistaFiltro(String filtro) {
        entity.getTransaction().begin();
        CriteriaBuilder criteriaBuilder = entity.getCriteriaBuilder();
        CriteriaQuery<Artistas> criteriaQuery = criteriaBuilder.createQuery(Artistas.class);
        criteriaQuery.distinct(true);
        Root<Artistas> raizArtistas = criteriaQuery.from(Artistas.class);
        Join<Artistas, Canciones> joinCanciones = raizArtistas.join("Canciones");
        raizArtistas.fetch("Canciones", JoinType.LEFT);
        criteriaQuery.where(criteriaBuilder.or(criteriaBuilder.like(raizArtistas.get("nombre"), "%" + filtro + "%"),
                criteriaBuilder.like(raizArtistas.get("genero"), "%" + filtro + "%"),
                criteriaBuilder.like(joinCanciones.get("nombre"), "%" + filtro + "%")
        )
        );
        TypedQuery<Artistas> query = entity.createQuery(criteriaQuery);
        List<Artistas> listArtista = query.getResultList();
        entity.getTransaction().commit();
        return listArtista;
    }

    @Override
    public List<Artistas> ListaArtistaFiltro(String filtro, int limit, int offset) {
        entity.getTransaction().begin();
        CriteriaBuilder criteriaBuilder = entity.getCriteriaBuilder();
        CriteriaQuery<Artistas> criteriaQuery = criteriaBuilder.createQuery(Artistas.class);
        criteriaQuery.distinct(true);
        Root<Artistas> raizArtistas = criteriaQuery.from(Artistas.class);
        Join<Artistas, Canciones> joinCanciones = raizArtistas.join("Canciones");
        criteriaQuery.where(
                criteriaBuilder.or(
                        criteriaBuilder.like(raizArtistas.get("nombre"), "%" + filtro + "%"),
                        criteriaBuilder.like(raizArtistas.get("genero"), "%" + filtro + "%"),
                        criteriaBuilder.like(joinCanciones.get("nombre"), "%" + filtro + "%")
                )
        );
        TypedQuery<Artistas> query = entity.createQuery(criteriaQuery);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        List<Artistas> listArtista = query.getResultList();
        entity.getTransaction().commit();
        return listArtista;
    }

    @Override
    public boolean agregaArtista(Artistas artistas) {
        try {
            entity.getTransaction().begin();
            entity.persist(artistas);
            entity.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public boolean agregaArtistaLista(List<Artistas> lista) {
        try {
            entity.getTransaction().begin();
            for (Artistas artistas : lista) {
                entity.persist(artistas);
            }
            entity.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
