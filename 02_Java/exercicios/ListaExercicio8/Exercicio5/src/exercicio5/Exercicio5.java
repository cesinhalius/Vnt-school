package exercicio5;

import java.util.Scanner;

/**
 *
 * Crie um programa que leia valores inteiros para a construção de uma matriz
 * 3x4. Após esses números serem lidos, analise se existem elementos negativos
 * na matriz. Caso exista, troque os números negativos por 0. Imprima as duas
 * matrizes, a original e a modificada
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[][] matrizModificada = new int[3][4];

        // leitura dos numeros;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Entre com um valor para a posicao " + "[" + i + "," + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("matriz original:");
        imprimirMatriz(matriz);
        System.out.println();
        
        
        
        // identificar numeros negativos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
                matrizModificada[i][j] = matriz[i][j];
            }
        }
        System.out.println("Matriz Modificada:");
        imprimirMatriz(matrizModificada);
        System.out.println();
   
        sc.close();
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + " ");
                
                
            }
        }
    }
}
