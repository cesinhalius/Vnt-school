package exercicio6;

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

        System.out.println("Entre com seu Nome:");
        f.nome = sc.nextLine();
        System.out.println("Entre com Salario Bruto: ");
        f.salarioBruto = sc.nextDouble();
        System.out.println("Entre com a porcentagem do imposto:");
        f.imposto = sc.nextDouble();
        System.out.println("Entre com a porcentagem de aumento de salario:");
        double aumento = sc.nextDouble();
        
        ImprimirInformacao(f.nome, f.salarioLiquido());

        System.out.println("-----------------------------------------------");
        
        
        ImprimirInformacao(f.nome, f.aumentoSalario(aumento));

    }

    static void ImprimirInformacao(String nome,double salario) {
        System.out.println("Seu nome eh: " + nome);
        System.out.println("Seu salario eh: " + salario);
    }

}
