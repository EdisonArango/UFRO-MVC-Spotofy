package modelo;

import java.util.ArrayList;
import org.orm.PersistentException;

public class SpotifyServices {
    
	private ArrayList<PlayList> playLists;
	private ArrayList<Cancion> canciones;
        
        public SpotifyServices() throws PersistentException {
            playLists = new ArrayList<>();
            canciones = new ArrayList<>();
            
            cargarPlaylist();
            cargarCanciones();
        }
        
        
    public ArrayList<PlayList> cargarPlaylist() throws PersistentException{
        playLists.clear();
        modelo.orm.Playlist[] playlists = modelo.orm.Playlist.listPlaylistByQuery(null, null);
        for (int i = 0; i < playlists.length; i++) {
            playLists.add(playListORMAPlaylist(playlists[i]));
        }
        return playLists;
    }
    
    public ArrayList<Cancion> cargarCanciones() throws PersistentException{
        canciones.clear();
        modelo.orm.Cancion[] cancionesORM = modelo.orm.Cancion.listCancionByQuery(null, null);
        for (int i = 0; i < cancionesORM.length; i++) {
            this.canciones.add(cancionORMACancion(cancionesORM[i]));
        }
        return canciones;
    }
        
        

	public void agregarCancionAPlaylist(int idCancion,int idPlaylist) throws PersistentException {
            modelo.orm.Playlist _playlist = modelo.orm.Playlist.loadPlaylistByORMID(idPlaylist);
            _playlist.idCancion.add(modelo.orm.Cancion.loadCancionByORMID(idCancion));
            _playlist.save();
//            playLists.agregarCancion(obtenerCancion(idCancion));
	}
        
        public Cancion obtenerCancion (int idCancion) throws PersistentException{
            modelo.orm.Cancion _cancion = modelo.orm.Cancion.loadCancionByORMID(idCancion);
            return cancionORMACancion(_cancion);
        }
        
        public PlayList obtenerPlayList (int idPlaylist) throws PersistentException{
            modelo.orm.Playlist _playlist = modelo.orm.Playlist.loadPlaylistByORMID(idPlaylist);
            return playListORMAPlaylist(_playlist);
        }
        
	public void crearPlayList(String nombre) throws PersistentException {
            modelo.orm.Playlist _playlist = modelo.orm.Playlist.createPlaylist();
            _playlist.setNombre(nombre);
            _playlist.save();
	}

	public String eliminarPlayList(int idPLayList) throws PersistentException {
            modelo.orm.Playlist _playlist = modelo.orm.Playlist.loadPlaylistByORMID(idPLayList);
            _playlist.deleteAndDissociate();
            String nombre = "";
            for (int i = 0; i < playLists.size(); i++) {
                if (playLists.get(i).getId()==idPLayList) {
                    nombre = playLists.get(i).getNombre();
                    playLists.remove(i);
                }
            }
            return "La Playlist '"+nombre+"' se ha eliminado";
	}

//	public void buscarCanciones(String consulta) {
//		throw new UnsupportedOperationException();
//	}

	public String eliminarCancionDePlayList(int idCancion,int idPlaylist) throws PersistentException {
                PlayList playlist = obtenerPlayList(idPlaylist);
		Cancion cancion = obtenerCancion(idCancion);
                playlist.eliminarCancion(cancion);
                return "La Cancion '"+cancion.getNombre()+"' se ha eliminado de la playlist '"+playlist.getNombre()+"'";
	}

//	public void reproducirCancion(int idCancion) {
//		throw new UnsupportedOperationException();
//	}
//
//	public void reproducirPLayList(int idPlayList) {
//		throw new UnsupportedOperationException();
//	}
        
        
        //Falta agregar el playlist
        public PlayList playListORMAPlaylist(modelo.orm.Playlist playlistORM){
            PlayList playlist = new  PlayList(playlistORM.getORMID(),playlistORM.getNombre());
            modelo.orm.Cancion[] cancionesORM = playlistORM.idCancion.toArray();
            for (int i = 0; i < cancionesORM.length; i++) {
                playlist.agregarCancion(cancionORMACancion(cancionesORM[i]));
            }
            return playlist;
        }
        
        public Cancion cancionORMACancion(modelo.orm.Cancion cancionORM){
            return new  Cancion(cancionORM.getORMID(),cancionORM.getNombre(),cancionORM.getArtista(),cancionORM.getGenero());
        }
        
}

