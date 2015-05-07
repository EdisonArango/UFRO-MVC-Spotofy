package modelo;

import java.util.ArrayList;

public class SpotifyServices {
    
	private ArrayList<PlayList> playLists;
	private ArrayList<Cancion> canciones;
        
        public SpotifyServices(){
            playLists = new ArrayList<>();
            canciones = new ArrayList<>();
            
            for (String[] datosCancione : datosCanciones) {
                canciones.add(new Cancion(datosCancione[0], datosCancione[1], datosCancione[2]));
            }
            playLists.add(new PlayList("Favoritos"));
        }

    public ArrayList<PlayList> getPlayList() {
        return playLists;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
        
        

	public void agregarCancionAPlaylist(Cancion cancion,PlayList playlist) {
            playlist.agregarCancion(cancion);
	}
        
        public Cancion obtenerCancion (int idCancion){
            for (int i = 0; i < canciones.size(); i++) {
                if (canciones.get(i).getId()==idCancion) {
                    return canciones.get(i);
                }
            }
            return null;
        }
        
        public PlayList obtenerPlayList (int idPlaylist){
            for (int i = 0; i < playLists.size(); i++) {
                if (playLists.get(i).getId()==idPlaylist) {
                    return playLists.get(i);
                }
            }
            return null;
        }
        
	public void crearPlayList(String nombre) {
            playLists.add(new PlayList(nombre));
	}

	public String eliminarPlayList(int idPLayList) {
            String nombre = "";
            for (int i = 0; i < playLists.size(); i++) {
                if (playLists.get(i).getId()==idPLayList) {
                    nombre = playLists.get(i).getNombre();
                    playLists.remove(i);
                }
            }
            return "La Playlist '"+nombre+"' se ha eliminado";
	}

	public void buscarCanciones(String consulta) {
		throw new UnsupportedOperationException();
	}

	public String eliminarCancionDePlayList(int idCancion,int idPlaylist) {
                PlayList playlist = obtenerPlayList(idPlaylist);
		Cancion cancion = obtenerCancion(idCancion);
                playlist.eliminarCancion(cancion);
                return "La Cancion '"+cancion.getNombre()+"' se ha eliminado de la playlist '"+playlist.getNombre()+"'";
	}

	public void reproducirCancion(int idCancion) {
		throw new UnsupportedOperationException();
	}

	public void reproducirPLayList(int idPlayList) {
		throw new UnsupportedOperationException();
	}
        
    private String[][] datosCanciones = {{"Like a Rolling Stone","Bob Dylan","Rock"},{"(I Can't Get No) Satisfaction","The Rolling Stones","Rock"},{"Imagine","John Lennon","Pop"},{"What's Going On","Marvin Gaye","R&R"},{"Respect","Aretha Franklin","Blues"},{"Good Vibrations","Beach Boys","Rock"},{"Johnny B. Goode","Chuck Berry","Blues"},{"Hey Jude","The Beatles","Pop-Rock"},{"Smells Like Teen Spirit","Nirvana","Grunge"},{"What'd I Say","Ray Charles","Blues"}};
}

