package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Digite codigo de um produto");

        System.out.printf("Total da compra eh R$ %.2f%n" , p.conta(sc.nextInt()));

    }

}
