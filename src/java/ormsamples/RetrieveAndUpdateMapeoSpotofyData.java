/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMapeoSpotofyData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.orm.Playlist lmodeloormPlaylist = modelo.orm.Playlist.loadPlaylistByQuery(null, null);
			// Update the properties of the persistent object
			lmodeloormPlaylist.save();
			modelo.orm.Cancion lmodeloormCancion = modelo.orm.Cancion.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			lmodeloormCancion.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Playlist by PlaylistCriteria");
		modelo.orm.PlaylistCriteria lmodeloormPlaylistCriteria = new modelo.orm.PlaylistCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloormPlaylistCriteria.id.eq();
		System.out.println(lmodeloormPlaylistCriteria.uniquePlaylist());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		modelo.orm.CancionCriteria lmodeloormCancionCriteria = new modelo.orm.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloormCancionCriteria.id.eq();
		System.out.println(lmodeloormCancionCriteria.uniqueCancion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMapeoSpotofyData retrieveAndUpdateMapeoSpotofyData = new RetrieveAndUpdateMapeoSpotofyData();
			try {
				retrieveAndUpdateMapeoSpotofyData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMapeoSpotofyData.retrieveByCriteria();
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
