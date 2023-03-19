package exercicio6;

import java.util.Scanner;

/**
 *
 * Crie um algoritmo para ordenar um vetor de tamanho 10. Leia todos os valores
 * e depois coloque em ordem crescente.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre com um numero :");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < 10; j++) {
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
            
        }

        System.out.println("Ordem crescente:    ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
        sc.close();
    }
}
