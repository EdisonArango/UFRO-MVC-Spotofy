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

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression artista;
	public final StringExpression genero;
	public final CollectionExpression idPlaylist;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		artista = new StringExpression("artista", this);
		genero = new StringExpression("genero", this);
		idPlaylist = new CollectionExpression("ORM_IdPlaylist", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(modelo.orm.MapeoSpotofyPersistentManager.instance().getSession());
	}
	
	public PlaylistCriteria createIdPlaylistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_IdPlaylist"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

