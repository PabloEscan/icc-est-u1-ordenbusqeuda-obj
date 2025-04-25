package Controllers;
import Models.Persona;

public class PersonaController {
    
    public void sortByDireccion(Persona[] personas){
        int tam = personas.length;

        for(int i = 0; i< tam; i++){
            int max = i;

            for(int j = i +1; j< tam; j++){
                if(personas[j].compareCodigoDireccion(personas[max])){
                    max = j;
                }
            }
            if( i != max){
                Persona temp = personas[i];
                personas[i] = personas[max];
                personas[max] = temp;
            }
        }
    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length-1;

        while (bajo <= alto) {
            int center = (bajo + alto)/2;

            if(personas[center].equalsByCodigoDireccion(codigo)){
                return personas[center];
            }

            if(personas[center].compareCodigoDireccion(codigo)){
                bajo = center +1;
            }else{
                alto = center -1;
            }
        }
        return null;
    }
}
