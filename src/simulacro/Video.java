package simulacro;

public abstract class Video {
    protected String titulo;
    protected int anio;
    protected String director;

    public Video(String titulo, int anio, String director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }
    
    protected abstract String retornarInformacion();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
