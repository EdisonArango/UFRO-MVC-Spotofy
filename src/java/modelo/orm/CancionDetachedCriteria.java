/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package modelo.orm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression artista;
	public final StringExpression genero;
	public final CollectionExpression idPlaylist;
	
	public CancionDetachedCriteria() {
		super(modelo.orm.Cancion.class, modelo.orm.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		idPlaylist = new CollectionExpression("ORM_IdPlaylist", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.orm.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		idPlaylist = new CollectionExpression("ORM_IdPlaylist", this.getDetachedCriteria());
	}
	
	public PlaylistDetachedCriteria createIdPlaylistCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ORM_IdPlaylist"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

