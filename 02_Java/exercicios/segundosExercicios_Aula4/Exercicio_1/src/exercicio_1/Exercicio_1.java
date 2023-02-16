
package exercicio_1;

import java.util.Scanner;

/**
 *
 * Crie um algoritmo que lê o nome de um correntista, 
 * sua agência econta. Exiba esses dados na tela.
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        String nome;
        int agencia;
        int conta;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite sua agencia:");
        agencia = sc.nextInt();
        System.out.println("Digite sua conta:");
        conta = sc.nextInt();
        
        
        
        
        
        
        System.out.println("Nome do correntista = " + nome);
        System.out.println("agencia do  correntista = " + agencia);
        System.out.println("conta do correntista = " + conta);
    }
    
}
