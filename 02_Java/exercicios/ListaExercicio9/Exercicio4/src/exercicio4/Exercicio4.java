package exercicio4;

import java.util.Scanner;

/**
 *
 * Um determinado material radioativoperde metade de sua massa a cada
 * 50segundos. Dada a massa inicial, emgramas, fazer um programa quedetermine o
 * tempo necessário para queessa massa se torne menor que 0,5grama. Escreva a
 * massa inicial, amassa final e o tempo calculado emhoras e minutos.
 */
public class Exercicio4 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Material h = new Material();
            double massaI;
            double massaF;
            int cont = 0;
            int minuto = 0;
            int horas = 0;
            
            System.out.println("Digite a massa inicial:");
            massaI = sc.nextDouble();
            System.out.println("massa Inicial eh: " + massaI);

            while(massaI >= 0.5){
                
                if (cont == 50) {
                   massaI = h.perdadamassa(massaI);
                }else{
                    if(cont == 60){
                        minuto++;
                        cont = 0;
                    }else{
                        if(minuto == 60){
                            horas++;
                            minuto = 0;
                        }
                    }
                }
                cont++;
            }
            massaF = massaI;

            
            System.out.printf("massa Final eh: %.2f%n" , massaF);
            System.out.println("O tempo gasto foi: " + horas + "h" + " " + minuto + "m");
            
    }

}
