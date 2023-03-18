package atividade1;

import java.util.Scanner;

/**
 *
 * Crie um algoritmo que leia um vetor de tamanho 4.Inicialize o vetor com o
 * usuário digitando os valores de cada elemento. Inicie a soma desse vetor com
 * uma variável num = 10.
 */
public class Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[4];
        int num = 10;
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Entre com um numero: ");
            v[i] = sc.nextInt();
            
            num = num + v[i];
            
            System.out.println("Elemento " + i + " : " + num);
        }
    }

}
