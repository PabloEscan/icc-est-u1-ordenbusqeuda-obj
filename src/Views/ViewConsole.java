package Views;
import Models.Persona;
public class ViewConsole {
    
    public void printArray(Persona[] persona){
        int tam = persona.length;

        for(int i = 0 ; i<tam; i++){
            System.out.println(persona[i]);
        }
    }
}
