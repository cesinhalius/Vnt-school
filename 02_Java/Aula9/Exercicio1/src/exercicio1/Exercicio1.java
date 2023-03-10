package exercicio1;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int numI = sc.nextInt();
        System.out.println("Entre com o numero final:");
        int numF = sc.nextInt();

        if (numI < numF) {
            while (numI <= numF) {
                System.out.println(numI);
                numI++;

            }
        } else {
            while (numI >= numF) {
                System.out.println(numI);
                numI--;
                
            }
        }
    }

}
