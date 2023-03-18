package exercicio9;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundo, minuto, horas;
        double massaF = 0;
        segundo = 0;
        minuto = 0;
        horas = 0;

        System.out.println("Entre com a massa do material: ");
        double massaI = sc.nextDouble();
        System.out.println(massaI);
        
        while (massaI >= 0.5) {
            if (segundo == 50) {
                massaI = massaI / 2;
            } else {
                if (segundo == 60) {
                    minuto++;
                    segundo = 0;
                }
            }

            if (minuto == 60) {
                minuto = 0;
                horas++;
            }
            segundo++;
        }
        massaF = massaI;
        
        System.out.println(massaF);
        System.out.println(horas + " : " + minuto + " : " + segundo);

    }

}
