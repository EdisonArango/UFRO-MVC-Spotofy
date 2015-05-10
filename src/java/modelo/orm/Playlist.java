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

public class Playlist {
	public Playlist() {
	}
	
	public static Playlist loadPlaylistByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadPlaylistByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist getPlaylistByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return getPlaylistByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadPlaylistByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist getPlaylistByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return getPlaylistByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Playlist) session.load(modelo.orm.Playlist.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist getPlaylistByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Playlist) session.get(modelo.orm.Playlist.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Playlist) session.load(modelo.orm.Playlist.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist getPlaylistByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Playlist) session.get(modelo.orm.Playlist.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlaylist(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return queryPlaylist(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlaylist(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return queryPlaylist(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist[] listPlaylistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return listPlaylistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist[] listPlaylistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return listPlaylistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlaylist(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Playlist as Playlist");
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
	
	public static List queryPlaylist(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Playlist as Playlist");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Playlist", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist[] listPlaylistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPlaylist(session, condition, orderBy);
			return (Playlist[]) list.toArray(new Playlist[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist[] listPlaylistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPlaylist(session, condition, orderBy, lockMode);
			return (Playlist[]) list.toArray(new Playlist[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadPlaylistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return loadPlaylistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Playlist[] playlists = listPlaylistByQuery(session, condition, orderBy);
		if (playlists != null && playlists.length > 0)
			return playlists[0];
		else
			return null;
	}
	
	public static Playlist loadPlaylistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Playlist[] playlists = listPlaylistByQuery(session, condition, orderBy, lockMode);
		if (playlists != null && playlists.length > 0)
			return playlists[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePlaylistByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return iteratePlaylistByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlaylistByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession();
			return iteratePlaylistByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlaylistByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Playlist as Playlist");
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
	
	public static java.util.Iterator iteratePlaylistByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.orm.Playlist as Playlist");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Playlist", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Playlist loadPlaylistByCriteria(PlaylistCriteria playlistCriteria) {
		Playlist[] playlists = listPlaylistByCriteria(playlistCriteria);
		if(playlists == null || playlists.length == 0) {
			return null;
		}
		return playlists[0];
	}
	
	public static Playlist[] listPlaylistByCriteria(PlaylistCriteria playlistCriteria) {
		return playlistCriteria.listPlaylist();
	}
	
	public static Playlist createPlaylist() {
		return new modelo.orm.Playlist();
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
			modelo.orm.Cancion[] lIdCancions = idCancion.toArray();
			for(int i = 0; i < lIdCancions.length; i++) {
				lIdCancions[i].idPlaylist.remove(this);
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
			modelo.orm.Cancion[] lIdCancions = idCancion.toArray();
			for(int i = 0; i < lIdCancions.length; i++) {
				lIdCancions[i].idPlaylist.remove(this);
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
		if (key == modelo.orm.ORMConstants.KEY_PLAYLIST_IDCANCION) {
			return ORM_idCancion;
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
	
	private java.util.Set ORM_idCancion = new java.util.HashSet();
	
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
	
	private void setORM_IdCancion(java.util.Set value) {
		this.ORM_idCancion = value;
	}
	
	private java.util.Set getORM_IdCancion() {
		return ORM_idCancion;
	}
	
	public final modelo.orm.CancionSetCollection idCancion = new modelo.orm.CancionSetCollection(this, _ormAdapter, modelo.orm.ORMConstants.KEY_PLAYLIST_IDCANCION, modelo.orm.ORMConstants.KEY_CANCION_IDPLAYLIST, modelo.orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
