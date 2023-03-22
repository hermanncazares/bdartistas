package Entitys;

import Entitys.Artistas;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-22T10:13:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Canciones.class)
public class Canciones_ { 

    public static volatile SingularAttribute<Canciones, Artistas> artistas;
    public static volatile SingularAttribute<Canciones, String> duracion;
    public static volatile SingularAttribute<Canciones, Long> id;
    public static volatile SingularAttribute<Canciones, String> nombre;

}