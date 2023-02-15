
package exercicio1;
import java.util.Locale;

/*
1) Faça um programa que seja capaz de identificar o 
Idioma do sistema do seu computador.
*/
public class Exercicio1 {

    public static void main(String[] args) {

        Locale loc = Locale.getDefault();
        
        String local = loc.getDisplayLanguage();
        
        System.out.print("O idioma desse sistema eh " + local);
        
    }
    
}
