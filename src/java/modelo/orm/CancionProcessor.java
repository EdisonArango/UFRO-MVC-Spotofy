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

import org.orm.PersistentException;
public class CancionProcessor {
	private int id;
	
	private String nombre;
	
	private String artista;
	
	private String genero;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setArtista(String value) {
		this.artista = value;
	}
	
	public String getArtista() {
		return artista == null ? "" : artista;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero == null ? "" : genero;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				modelo.orm.Cancion _cancion = modelo.orm.Cancion.loadCancionByORMID(getId());
				if (_cancion!= null) {
					copyFromBean(_cancion);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				modelo.orm.Cancion _cancion = modelo.orm.Cancion.createCancion();
				copyToBean(_cancion);
				if (_cancion.save()) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				modelo.orm.Cancion _cancion= modelo.orm.Cancion.loadCancionByORMID(getId());
				if (_cancion != null) {
					copyToBean(_cancion);
					if (_cancion.save()) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				modelo.orm.Cancion _cancion = modelo.orm.Cancion.loadCancionByORMID(getId());
				if (_cancion != null && _cancion.deleteAndDissociate()) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(modelo.orm.Cancion _cancion) {
		setNombre(_cancion.getNombre());
		setArtista(_cancion.getArtista());
		setGenero(_cancion.getGenero());
		setId(_cancion.getORMID());
	}
	
	private void copyToBean(modelo.orm.Cancion _cancion) {
		_cancion.setNombre(getNombre());
		_cancion.setArtista(getArtista());
		_cancion.setGenero(getGenero());
	}
	
}

