package exercicio4;

import java.util.Scanner;

/**
 *
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
 * uma das duas coordenadas for NULA. Nesta situação escreva umamensagem
 * "Algoritmo Interrompido!!".
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a coordenada x: ");
        int x = sc.nextInt();
        System.out.println("Entre com a coordenada y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }
            System.out.println("--------------------------------------");

            System.out.println("Entre com a coordenada x: ");
            x = sc.nextInt();
            System.out.println("Entre com a coordenada y: ");
            y = sc.nextInt();

        }
        System.out.println("Algoritmo Interrompido!!");
        sc.close();
    }

}
