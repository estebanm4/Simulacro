package logica;
import java.io.*;
import java.util.*;

public class CargaArchivos {
    
    public void Cargar (String ruta){
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
            try{
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo = "";
                while(flujoEntrada.hasNext()){
                    tipo = flujoEntrada.next().trim();
                    if(tipo.equals("S")){
                        
                    } else if (tipo.equals("D")){
                        
                    } else if (tipo.equals("P")){
                        
                    }
                    System.out.println(tipo);
                }
            } catch(IOException e ){
                e.printStackTrace();
            }
        }
    }
}
