package exercicio6;

import java.util.Scanner;

/**
 * Escreva o algoritmo "Programa Solidário". O doador deve clicar nas opções
 * (mostradas abaixo) para efetuar a sua doação. Imprima o resultado na tela com
 * o valor da doação e uma mensagem de agradecimento
 *
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============Programa Solidario===================");
        System.out.println(" ");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para doar outros valores");
        System.out.println("[5] para cancelar");
        System.out.println("Entre com a opcao:");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Obrigado pela doacao de R$10 reais");
                break;
            case 2:
                System.out.println("Obrigado pela doacao de R$25 reais");
                break;
            case 3:
                System.out.println("Obrigado pela doacao de R$50 reais");
                break;
            case 4:
                System.out.print("Digite o valor que quer doar:");
                double valor = sc.nextDouble();
                System.out.println(" Obrigado pela doacao de R$ " + valor + " reais ");
                break;
            case 5:
                System.out.println("Obrigado pela visita");
                break;
            default:
                System.out.println("Digite uma opcao correta");
                break;
        }
        sc.close();
    }

}
