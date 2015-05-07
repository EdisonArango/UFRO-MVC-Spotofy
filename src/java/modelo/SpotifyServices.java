package modelo;

import java.util.ArrayList;

public class SpotifyServices {
    
	private ArrayList<PlayList> playLists;
	private ArrayList<Cancion> canciones;
        
        public SpotifyServices(){
            playLists = new ArrayList<>();
            canciones = new ArrayList<>();
            
            for (int i = 0; i < datosCanciones.length; i++) {
                canciones.add(new Cancion(datosCanciones[i][0],datosCanciones[i][1],datosCanciones[i][2]));
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

	public void eliminarPlayList(int idPLayList) {
		throw new UnsupportedOperationException();
	}

	public void buscarCanciones(String consulta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCancionDePlayList(int idCancion) {
		throw new UnsupportedOperationException();
	}

	public void reproducirCancion(int idCancion) {
		throw new UnsupportedOperationException();
	}

	public void reproducirPLayList(int idPlayList) {
		throw new UnsupportedOperationException();
	}
        
    private String[][] datosCanciones = {{"Like a Rolling Stone","Bob Dylan","Rock"},{"(I Can't Get No) Satisfaction","The Rolling Stones","Rock"},{"Imagine","John Lennon","Pop"},{"What's Going On","Marvin Gaye","R&R"},{"Respect","Aretha Franklin","Blues"},{"Good Vibrations","Beach Boys","Rock"},{"Johnny B. Goode","Chuck Berry","Blues"},{"Hey Jude","The Beatles","Pop-Rock"},{"Smells Like Teen Spirit","Nirvana","Grunge"},{"What'd I Say","Ray Charles","Blues"}};
}

