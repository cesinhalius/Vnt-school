package atividade3;

import java.util.Scanner;

/**
 * Crie um algoritmo que leia doisnúmeros e calcule a soma, amultiplicação e o
 * dobro. Por fim, imprima o resultado. Para a resolução do exercício, crie as
 * funções soma, multiplicação, dobro e imprima.
 *
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número:");
        int primeiro = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        int segundo = sc.nextInt();

        imprimir("soma ", somar(primeiro, segundo));
        imprimir("multiplicar ", multiplicar(primeiro, segundo));
        imprimir("dobro ", dobro(primeiro));
        imprimir("dobro ", dobro(segundo));
    }

    private static void imprimir(String x, int variavel) {

        System.out.println("Resultado da " + x + variavel);

    }

    private static int dobro(int valor) {
        return multiplicar(valor, 2);
    }

    private static int multiplicar(int primeiro, int segundo) {
        return primeiro * segundo;
    }

    private static int somar(int primeiro, int segundo) {
        return primeiro + segundo;
    }
}
