package simulacro;

import java.util.ArrayList;

public class Pelicula extends Video{
    
    private ArrayList <Actor> actores;

    public Pelicula(String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.actores = new ArrayList<>();
    }
    //Asociacion
    public void addActor( Actor actor){
        this.actores.add(actor);
    }
    
    //Composicion
    public void addActor(String nombre, String apellido){
        Actor actor = new Actor(nombre, apellido);
        this.actores.add(actor);
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }
    
    @Override
    public String retornarInformacion(){
        String informacion = "";
        for(Actor actor : actores){
            informacion += actor;
        }
        return informacion;
    }
    
}
