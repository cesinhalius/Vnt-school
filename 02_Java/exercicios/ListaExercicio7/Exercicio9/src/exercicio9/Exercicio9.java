package exercicio9;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundo = 0;
        int minuto = 0;
        int horas = 0;
        double massaF = 0;

        System.out.println("Entre com a massa do material: ");
        double massaI = sc.nextDouble();

        while (massaF < 0.5) {
            for (int i = 0; i <= segundo; i++) {
                if (i == 50) {
                    massaF = massaI - (massaI / 2);
                } else {
                    if (i == 60) {
                        i = 0;
                        minuto++;
                    }
                }
                
                if(minuto == 60){
                    minuto = 0;
                    horas++;
                }

            }
        }
        System.out.println(massaI);
        System.out.println(massaF);
        System.out.println(horas + " : " + minuto + " : " + segundo);

    }

}
