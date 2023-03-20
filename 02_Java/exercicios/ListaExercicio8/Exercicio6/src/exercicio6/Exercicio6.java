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

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Entre com um numero :");
            vetor[i] = sc.nextInt();
        }
        
        ordemCrescente(vetor);

        System.out.println("Ordem crescente:    ");
        
        imprimirVetor(vetor);

        sc.close();
    }

    static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");

        }
        System.out.println();

    }

    static void ordemCrescente(int[] v) {
        int aux;

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }

        }
    }
}
