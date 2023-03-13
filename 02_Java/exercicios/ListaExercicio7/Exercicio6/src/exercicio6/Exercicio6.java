package exercicio6;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro positivo X. O programa deve
 * então mostrar na tela X linhas, começando de 1 até X. Para cada linha,
 * mostrar o número da linha, depois o quadrado e o cubo do valor.
 *
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha = 1;
        double quadrado = 0;
        double cubo;
        
        System.out.println("Entre com um numero:");
        int num = sc.nextInt();
        
        if(num >= 0){
            for (int i = 1; i <= num; i++) {
                quadrado = Math.pow(i, 2);
                cubo = Math.pow(i, 3);
                
                System.out.println("quadrado | cubo");
                System.out.println( linha + "  " + quadrado + " | " + cubo);
                linha++;
            }
        }
    }

}
