package exercicio10;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
 * uma duração mínima de 1 hora e máxima de 24 horas. Imprima uma mensagem com o
 * resultado.
 *
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Hora Inicial : ");
        int hInicial = sc.nextInt();
        System.out.print("Digite a Hora Final : ");
        int hFinal = sc.nextInt();

        if (hInicial > hFinal) {
            System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
        } else if (hFinal > hInicial) {
            System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }

}
