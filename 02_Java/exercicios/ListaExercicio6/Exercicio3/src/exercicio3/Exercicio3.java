package exercicio3;

import java.util.Scanner;

/**
 *
 * Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um
 * financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes
 * o salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido";
 * senão, ele deverá escrever "Financiamento Negado". Independente de conceder
 * ou não o financiamento, o algoritmo escreverá depois a frase "Obrigado por
 * nos consultar."
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com valor do seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Entre com valor do financiamento: ");
        double financiamento = sc.nextDouble();

        if (financiamento <= (salario * 5)) {
            System.out.println("Financiamento Concedido");
            System.out.println("Obrigado por nos consultar");
        } else {
            System.out.println("Financiamento Negado");
            System.out.println("Obrigado por nos consultar");
        }
    }

}
