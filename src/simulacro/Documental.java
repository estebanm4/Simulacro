package simulacro;

public class Documental extends Video{
    
    private String genero;

    public Documental(String genero, String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String retornarInformacion(){
        return this.genero + "" + super.toString();
    }
    
}
