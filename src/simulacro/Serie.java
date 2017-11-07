package simulacro;

public class Serie extends Video {
    
    private int capitulos;
    private int temporada;

    public Serie(int capitulos, int temporada, String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.capitulos = capitulos;
        this.temporada = temporada;
    }

    @Override
    protected String retornarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
