package exercicio2;

import java.util.Scanner;

/**
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
 * sobre o valor em dólar. Crieuma classe Conversor para ser responsável pelos
 * cálculos.
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conversor c = new Conversor();

        System.out.print("Conversor de dolar em real\n\n");

        System.out.print("Digite a cotacao do dolar: ");
        c.cotacao = entrada.nextDouble();

        System.out.print("Digite o valor em dolar: ");
        c.valorDolar = entrada.nextDouble();

        

        System.out.printf("O Valor em reais eh %.1f%n", c.PagarDolar());
    }

}
