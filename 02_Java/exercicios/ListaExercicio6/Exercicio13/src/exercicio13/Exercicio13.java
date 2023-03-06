package exercicio13;

import java.util.Scanner;

/**
 *
 * Pagar impostos é uma atividade corriqueira para a manutenção de atividades
 * que competem a sociedade. No Brasil, vários produtos e os salários são
 * taxados com impostos. Para os salários, os impostos são taxados de acordo com
 * a faixa salarial. Leia um valor com duas casas decimais, equivalente ao
 * salário de uma pessoa no Brasil. Em seguida, calcule e mostre o valor que
 * esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com valor: ");
        double valor = sc.nextDouble();
        double Ptotal;

        if (valor <= 1903.98) {
            System.out.println("Voce tera que pagar: " + valor);
        } else {
            if (valor >= 1903.99 && valor <= 2826.65) {
                Ptotal = valor + 0.075;
                System.out.println("Voce tera que pagar: " + Ptotal);
            } else {
                if (valor >= 2826.66 && valor <= 3751.05) {
                    Ptotal = valor + 0.15;
                    System.out.println("Voce tera que pagar: " + Ptotal);
                } else {
                    if (valor >= 3751.06 && valor <= 4664.68) {
                        Ptotal = valor + 0.225;
                        System.out.println("Voce tera que pagar: " + Ptotal);
                    } else {
                        if (valor >= 4664.68) {
                            Ptotal = valor + 0.275;
                            System.out.println("Voce tera que pagar: " + Ptotal);
                        }

                    }
                }
            }

        }
    }

}
