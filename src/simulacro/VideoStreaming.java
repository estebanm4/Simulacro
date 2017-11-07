package simulacro;

import java.util.ArrayList;

public class VideoStreaming {
    private ArrayList<Video> videos;
    
    public VideoStreaming(){
        this.videos = new ArrayList<>();
    }
    
    public String listarVideos(){
        String listaVideos = "";
        for (Object video : videos){
            listaVideos += video;
        }
        return listaVideos;
    }
    
    public ArrayList<Actor> listarActores(){
        ArrayList<Actor> actores = new ArrayList<>();
        for(Video video : videos) {
            if(video instanceof Pelicula){
                Pelicula p = (Pelicula)video;
                actores.addAll(p.getActores());
            }
        }
        return actores;
    }
    //Composición
    public void addVideo(String titulo, int anio, String director, int capitulos, int temporada){
        Serie serie = new Serie (capitulos, temporada, titulo, anio, director);
        this.videos.add(serie);
        
    }
    
    //Si fuera relación de Asociación y Agregación
    public void addVideo(Video video){
        this.videos.add(video);
    }
}
