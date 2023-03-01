package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero");
        int n = sc.nextInt();
        String r;

        r = (n > 10) || (n < 10) ? "Numero e maior que 10" : n < 5 || n > 5 ? "Numero e maior que 5" : "Numero e menor que 5";

        System.out.println(r);

    }

}
