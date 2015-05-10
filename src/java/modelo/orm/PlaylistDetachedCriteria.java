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

public class PlaylistDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression idCancion;
	
	public PlaylistDetachedCriteria() {
		super(modelo.orm.Playlist.class, modelo.orm.PlaylistCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idCancion = new CollectionExpression("ORM_IdCancion", this.getDetachedCriteria());
	}
	
	public PlaylistDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.orm.PlaylistCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idCancion = new CollectionExpression("ORM_IdCancion", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createIdCancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_IdCancion"));
	}
	
	public Playlist uniquePlaylist(PersistentSession session) {
		return (Playlist) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Playlist[] listPlaylist(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Playlist[]) list.toArray(new Playlist[list.size()]);
	}
}

