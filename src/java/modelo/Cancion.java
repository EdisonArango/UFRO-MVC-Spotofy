package modelo;


public class Cancion {
        
        private int id;
	private String nombre;
	private String artista;
	private String genero;
	private String rutaArchivo;

    public Cancion(int id,String nombre, String artista, String genero) {
        this.id=id;
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
        
}