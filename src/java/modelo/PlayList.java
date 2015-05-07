package modelo;

import java.util.ArrayList;

public class PlayList {
    
        private static int actual=1;
        private int id;
	private String nombre;
	private ArrayList<Cancion> canciones;

    public PlayList(String nombre) {
        id=actual;
        actual++;
        this.nombre = nombre;
        canciones = new ArrayList<>();
    }
        

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }


    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    public boolean cancionEsta(Cancion cancion){
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i)==cancion) {
                return true;
            }
        }
        return false;
    }
    
    public void eliminarCancion (Cancion Cancion){
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i)==Cancion) {
                canciones.remove(i);
                break;
            }
        }
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}