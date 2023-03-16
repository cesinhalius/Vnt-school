package atividade4;

import java.util.Scanner;

/**
 *
 * Crie um programa que gere uma matriz 3x3. Leia todos os elementos da matriz
 * a) Soma total dos elementos. 
 * b) Soma dos elementos da linha 3. 
 * c) Soma dos elementos da coluna 2.
 * d) Soma dos elementos da diagonal principal.
 */
public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaTodos = 0;
        int somalinha3 = 0;
        int somaColuna2 = 0;
        int somaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("entre com um numero");
                matriz[i][j] = sc.nextInt();
                //Somar todos os elementos
                somaTodos = matriz[i][j] + somaTodos;
                if (i == 2) {
                    somalinha3 = matriz[i][j] + somalinha3;
                }
                if (j == 1) {
                    somaColuna2 = matriz[i][j] + somaColuna2;
                }
                if(i == j){
                    somaDiagonal = matriz[i][j] + somaDiagonal; 
                }

            }
        }
        
        System.out.println("Soma Total eh " + somaTodos);
        System.out.println("Soma linha 3 eh " + somalinha3);
        System.out.println("soma coluna 2 eh " + somaColuna2);
        System.out.println("soma diagonal principal eh " + somaDiagonal);
    }

}
