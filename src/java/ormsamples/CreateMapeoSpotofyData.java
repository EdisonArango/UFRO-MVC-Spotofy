/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMapeoSpotofyData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelo.orm.MapeoSpotofyPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.orm.Playlist lmodeloormPlaylist = modelo.orm.Playlist.createPlaylist();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idCancion
			lmodeloormPlaylist.save();
			modelo.orm.Cancion lmodeloormCancion = modelo.orm.Cancion.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idPlaylist
			lmodeloormCancion.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMapeoSpotofyData createMapeoSpotofyData = new CreateMapeoSpotofyData();
			try {
				createMapeoSpotofyData.createTestData();
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
