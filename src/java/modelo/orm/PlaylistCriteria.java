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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PlaylistCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression idCancion;
	
	public PlaylistCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		idCancion = new CollectionExpression("ORM_IdCancion", this);
	}
	
	public PlaylistCriteria(PersistentSession session) {
		this(session.createCriteria(Playlist.class));
	}
	
	public PlaylistCriteria() throws PersistentException {
		this(modelo.orm.MapeoSpotofyPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createIdCancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_IdCancion"));
	}
	
	public Playlist uniquePlaylist() {
		return (Playlist) super.uniqueResult();
	}
	
	public Playlist[] listPlaylist() {
		java.util.List list = super.list();
		return (Playlist[]) list.toArray(new Playlist[list.size()]);
	}
}

