package exercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
 * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        double imposto = 0;

        try {
            System.out.println("Entre com o nome do Funcionario:");
            f.setNome(sc.next());
            System.out.println("Entre com o salário bruto do funcionario:");
            f.setSalarioBruto(sc.nextDouble());
            System.out.println("Entre com o valor do imposto:");
            imposto = sc.nextDouble();
            if (f.getSalarioBruto() <= 0 || imposto < 0) {
                System.out.println("Favor inserir valores validos!");

            }

        } catch (InputMismatchException e) {
            System.out.println("Favor inserir valores !");
            sc.next();
        }
        System.out.printf("Nome: %s Salário Liquido: %.2f%n", f.getNome(), f.descontoImposto(imposto));
        System.out.println("Entre com o valor do aumento:");
        System.out.printf("Nome : %s Salário bruto com aumento: %.2f%n", f.getNome(), f.aumentoSalario(sc.nextDouble()));
        System.out.printf("Nome: %s Salário Liquido corrigido: %.2f%n", f.getNome(), f.descontoImposto(imposto));

    }

}
