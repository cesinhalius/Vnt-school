
package exercicio2;
import java.awt.Dimension;
import java.awt.Toolkit;

/* 2) Faça um programa que seja capaz de identificar a resolução 
a tela do seu computador.
*/

public class Exercicio2 {


    public static void main(String[] args) {
       Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = tela.width;
        int alt = tela.height;
       
       System.out.println("Sua tela tem resolucao "  + lar + " x " + alt);
    }
    
}
