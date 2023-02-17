package exercicio_5;

import java.util.Scanner;

/**
 *
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
 * calcule e mostre a diferença do produto de A e B pelo produto de C e D,
 * segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        int A, B, C, D;
        int result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para A:");
        A = sc.nextInt();
        System.out.println("Digite um numero para B:");
        B = sc.nextInt();
        System.out.println("Digite um numero para C:");
        C = sc.nextInt();
        System.out.println("Digite um numero para D:");
        D = sc.nextInt();
        
        result = ((A * B) - (C * D));
        
        System.out.println("Entrada: " + A + ", " + B + ", " + C + ", " + D + " " + "Saida: DIFERENCA = " + result);       
    }

}
