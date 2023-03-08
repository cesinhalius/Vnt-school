package exercicio5;

import java.util.Scanner;

/**
 *
 * Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus
 * funcionários de acordo com a tabela ao lado. Escreva um algoritmo que lê,
 * para cada funcionário, o seu nome e o seu salário atual. Após receber estes
 * dados, o algoritmo calcula o novo salário e escreve na tela as seguintes
 * informações: % de aumento salario atual salario novo
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Entre com o seu salario: ");
        double salario = sc.nextDouble();
        double novoSalario;
        double aumento;

        switch ((int) salario) {

            case 0, 1, 2, 3: {
                aumento = 0.20;
                novoSalario = salario + (salario * aumento);
                aumento = 20;
                break;
            }
            case 4, 5, 6: {
                aumento = 0.15;
                novoSalario = salario + (salario * aumento);
                aumento = 15;
                break;
            }
            case 7, 8, 9: {
                aumento = 0.12;
                novoSalario = salario + (salario * aumento);
                aumento = 12;
                break;
            }
            case 10, 11, 12: {
                aumento = 0.1;
                novoSalario = salario + (salario * aumento);
                aumento = 10;
                break;
            }
            case 13, 14, 15: {
                aumento = 0.07;
                novoSalario = salario + (salario * aumento);
                aumento = 7;
                break;
            }
            default: {
                aumento = 0;
                novoSalario = salario + (salario * aumento);
                break;
            }
        }

        System.out.println(aumento + " % aumento " + salario + "    " + novoSalario);

    }

}
