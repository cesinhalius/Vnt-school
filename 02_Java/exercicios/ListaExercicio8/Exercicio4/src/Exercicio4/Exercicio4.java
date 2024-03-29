package Exercicio4;

import java.util.Scanner;

/**
 *
 * Crie um programa que gere uma matriz 3x3. Leia todos os elementos da matriz
 * a) Soma total dos elementos. b) Soma dos elementos da linha 3. c) Soma dos
 * elementos da coluna 2. d) Soma dos elementos da diagonal principal.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("entre com um numero");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Soma Total eh " + SomarTodos(matriz));
        System.out.println("Soma linha 3 eh " + SomarLinha3(matriz));
        System.out.println("soma coluna 2 eh " + SomarColuna2(matriz));
        System.out.println("soma diagonal principal eh " + SomarDiagonal(matriz));
    }

    static int SomarTodos(int[][] matriz) {
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aux += matriz[i][j];

            }
        }
        return aux;
    }

    static int SomarLinha3(int[][] matriz) {
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 2) {
                    aux += matriz[i][j];
                }

            }
        }
        return aux;
    }

    static int SomarColuna2(int[][] matriz) {
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 1) {
                    aux += matriz[i][j];
                }

            }
        }
        return aux;
    }

    static int SomarDiagonal(int[][] matriz) {
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i) {
                    aux += matriz[i][j];
                }

            }
        }
        return aux;
    }
}
