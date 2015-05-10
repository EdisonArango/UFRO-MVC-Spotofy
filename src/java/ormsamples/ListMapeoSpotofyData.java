/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMapeoSpotofyData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Playlist...");
		modelo.orm.Playlist[] modeloormPlaylists = modelo.orm.Playlist.listPlaylistByQuery(null, null);
		int length = Math.min(modeloormPlaylists.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modeloormPlaylists[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		modelo.orm.Cancion[] modeloormCancions = modelo.orm.Cancion.listCancionByQuery(null, null);
		length = Math.min(modeloormCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modeloormCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Playlist by Criteria...");
		modelo.orm.PlaylistCriteria lmodeloormPlaylistCriteria = new modelo.orm.PlaylistCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloormPlaylistCriteria.id.eq();
		lmodeloormPlaylistCriteria.setMaxResults(ROW_COUNT);
		modelo.orm.Playlist[] modeloormPlaylists = lmodeloormPlaylistCriteria.listPlaylist();
		int length =modeloormPlaylists== null ? 0 : Math.min(modeloormPlaylists.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloormPlaylists[i]);
		}
		System.out.println(length + " Playlist record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		modelo.orm.CancionCriteria lmodeloormCancionCriteria = new modelo.orm.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloormCancionCriteria.id.eq();
		lmodeloormCancionCriteria.setMaxResults(ROW_COUNT);
		modelo.orm.Cancion[] modeloormCancions = lmodeloormCancionCriteria.listCancion();
		length =modeloormCancions== null ? 0 : Math.min(modeloormCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloormCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMapeoSpotofyData listMapeoSpotofyData = new ListMapeoSpotofyData();
			try {
				listMapeoSpotofyData.listTestData();
				//listMapeoSpotofyData.listByCriteria();
			}
			finally {
				modelo.orm.MapeoSpotofyPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
