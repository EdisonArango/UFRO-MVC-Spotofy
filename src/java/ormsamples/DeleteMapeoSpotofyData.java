/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMapeoSpotofyData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.orm.Playlist lmodeloormPlaylist = modelo.orm.Playlist.loadPlaylistByQuery(null, null);
			lmodeloormPlaylist.delete();
			modelo.orm.Cancion lmodeloormCancion = modelo.orm.Cancion.loadCancionByQuery(null, null);
			lmodeloormCancion.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMapeoSpotofyData deleteMapeoSpotofyData = new DeleteMapeoSpotofyData();
			try {
				deleteMapeoSpotofyData.deleteTestData();
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
