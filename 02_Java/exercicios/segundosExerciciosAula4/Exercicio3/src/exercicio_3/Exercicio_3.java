
package exercicio_3;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e 
 * depois mostrar na tela a soma desses números com uma 
 * mensagem explicativa
 * Entrada:10, 30 Saída:SOMA = 40
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int resp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        n1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        n2 = sc.nextInt();
        
        resp = n1 + n2;
        
        System.out.println("Entrada: " + n1 + ", 5"+ n2 + " " + "Saida: SOMA = " + resp);
    }
    
}
