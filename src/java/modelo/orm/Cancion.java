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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Cancion {
	public Cancion() {
	}
	
	public static Cancion loadCancionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return getCancionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return getCancionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cancion) session.load(modelo.orm.Cancion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cancion) session.get(modelo.orm.Cancion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.load(modelo.orm.Cancion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.get(modelo.orm.Cancion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy, lockMode);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy, lockMode);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByCriteria(CancionCriteria cancionCriteria) {
		Cancion[] cancions = listCancionByCriteria(cancionCriteria);
		if(cancions == null || cancions.length == 0) {
			return null;
		}
		return cancions[0];
	}
	
	public static Cancion[] listCancionByCriteria(CancionCriteria cancionCriteria) {
		return cancionCriteria.listCancion();
	}
	
	public static Cancion createCancion() {
		return new modelo.orm.Cancion();
	}
	
	public boolean save() throws PersistentException {
		try {
			modelo.orm.MapeoSpotofyPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			modelo.orm.MapeoSpotofyPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			modelo.orm.MapeoSpotofyPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			modelo.orm.MapeoSpotofyPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			modelo.orm.Playlist[] lIdPlaylists = idPlaylist.toArray();
			for(int i = 0; i < lIdPlaylists.length; i++) {
				lIdPlaylists[i].idCancion.remove(this);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.orm.Playlist[] lIdPlaylists = idPlaylist.toArray();
			for(int i = 0; i < lIdPlaylists.length; i++) {
				lIdPlaylists[i].idCancion.remove(this);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == modelo.orm.ORMConstants.KEY_CANCION_IDPLAYLIST) {
			return ORM_idPlaylist;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private String artista;
	
	private String genero;
	
	private java.util.Set ORM_idPlaylist = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setArtista(String value) {
		this.artista = value;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero;
	}
	
	private void setORM_IdPlaylist(java.util.Set value) {
		this.ORM_idPlaylist = value;
	}
	
	private java.util.Set getORM_IdPlaylist() {
		return ORM_idPlaylist;
	}
	
	public final modelo.orm.PlaylistSetCollection idPlaylist = new modelo.orm.PlaylistSetCollection(this, _ormAdapter, modelo.orm.ORMConstants.KEY_CANCION_IDPLAYLIST, modelo.orm.ORMConstants.KEY_PLAYLIST_IDCANCION, modelo.orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
