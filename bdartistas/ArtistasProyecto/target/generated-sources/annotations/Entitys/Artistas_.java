package Entitys;

import Entitys.Canciones;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-22T10:13:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Artistas.class)
public class Artistas_ { 

    public static volatile SingularAttribute<Artistas, String> genero;
    public static volatile ListAttribute<Artistas, Canciones> Canciones;
    public static volatile SingularAttribute<Artistas, Integer> id;
    public static volatile SingularAttribute<Artistas, String> nombre;

}