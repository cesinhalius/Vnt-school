package exercicio1;

import java.util.Scanner;

/**
 * Faça um Algoritmo que leia um dado número e imprima na tela se este é um
 * número primo ou não.
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);

     
            System.out.print("Digite um numero maior do que zero: ");
            int N = sc.nextInt();
        
            if(Primos(N)== true){
                System.out.println("O numero " + N + " eh primo");
            }else{
                System.out.println("O numero " + N + " nao eh primo");
            }

    }

    static boolean Primos(int x) {
        if (x <= 1) {
            return false;
        }

        // Check from 2 to n-1
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
