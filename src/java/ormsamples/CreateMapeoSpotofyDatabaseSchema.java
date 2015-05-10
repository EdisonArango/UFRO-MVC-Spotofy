/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMapeoSpotofyDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(modelo.orm.MapeoSpotofyPersistentManager.instance());
			modelo.orm.MapeoSpotofyPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
