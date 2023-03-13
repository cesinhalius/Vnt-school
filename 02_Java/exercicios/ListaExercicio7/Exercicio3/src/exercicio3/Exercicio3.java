package exercicio3;

import java.util.Scanner;

/**
 *
 * Faça um programa que leia um número inteiro N e calcule todos os seus
 * divisores.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um numero");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if(N % i == 0){
                System.out.println(i);
            }
        }
        
        
    }

}
