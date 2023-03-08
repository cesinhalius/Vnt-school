package exercicio9;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 * "SaoMultiplos" ou "NaosaoMultiplos", indicando se os valores lidos são
 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
 * crescente ou decrescente.
 *
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int num1 = sc.nextInt();
        System.out.print("Entre com outro valor: ");
        int num2 = sc.nextInt();

        int resto = num1 % num2;
        int resto2 = num2 % num1;

        if (resto == 0 || resto2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();

    }

}
