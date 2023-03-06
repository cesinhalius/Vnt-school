package exercicio8;

import java.util.Scanner;

/**
 * Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a situação em
 * que ela se encontra. Analise a tabela ao lado e desenvolva o programa pedido.
 *
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com seu peso:");
        double peso = sc.nextDouble();
        System.out.print("Entre com sua altura:");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        switch ((int) IMC) {
            default:
                System.out.println("Nao tem uma classificacao para esse IMC ");
                break;
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                System.out.println("Voce esta com Magreza grave");
                break;

            case 16:
                System.out.println("Voce esta com Magreza moderada");
                break;

            case 17, 18:
                System.out.println("Voce esta com Magreza leve");
                break;

            case 19, 20, 21, 22, 23, 24:
                System.out.println("Voce esta Saudavel");
                break;

            case 25, 26, 27, 28, 29:
                System.out.println("Voce esta com Sobrepeso");
                break;
            case 30, 31, 32, 33, 34:
                System.out.println("Voce esta com Obesidade Grau I");
                break;
            case 35, 36, 37, 38, 39:
                System.out.println("Voce esta com Obesidade Grau II");
                break;
            case 40:
                System.out.println("Voce esta com Obesidade Grau III");
                break;
        }
    }

}
