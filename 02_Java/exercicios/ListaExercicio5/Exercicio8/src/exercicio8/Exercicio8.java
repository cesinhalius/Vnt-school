package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor para A:");
        double a = sc.nextDouble();
        System.out.println("Entre com o valor para B:");
        double b = sc.nextDouble();
        System.out.println("Entre com o valor para C:");
        double c = sc.nextDouble();
        double delta, r1, r2;

        delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta = " + Math.round(delta));
        if (delta > 0) {
            r1 = ((-b + Math.sqrt(delta)) / (2 * a));
            r2 = ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("r1 = " + Math.round(r1));
            System.out.println("r2 = " + Math.round(r2));
        } else {
            if (delta == 0) {
                r1 = ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("r1 = " + r1);
            } else {
                System.out.println("Nao tem raiz ");
            }
        }

    }

}
