package exercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Crie um programa que escolha um número aleatório entre 100 números de forma
 * randômica. Após tal escolha, o programa deve ler a entrada de um número com o
 * intuito de adivinhar o número escolhido randomicamente. Crie o programa de
 * tal forma que, a cada número digitado ele indique se o número verdadeiro é
 * maior ou menor. Dessa forma, você consegue adivinhar mais rápido ao número
 * randômico.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, palpite = 0;
        int cont = 0;
        Random numAleatorio = new Random();

        num = numAleatorio.nextInt(100);

        while (palpite != num) {
            System.out.print("Digite seu palpite:");
            palpite = sc.nextInt();

            cont++;
            if (palpite > num) {
                System.out.println("Digite um numero menor: ");
            } else {
                if (palpite < num) {
                    System.out.println("Digite um numero maior: ");
                }else{
                    System.out.println("Parabens!! ");
                    System.out.println("voce acertou com " + cont + "Tentativas");
                }
            }
                    
                   
        }
        
        sc.close();
    }

}
