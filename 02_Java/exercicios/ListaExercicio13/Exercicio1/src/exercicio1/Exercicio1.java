package exercicio1;

import java.util.*;

/**
 *
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com o número de funcionários que deseja cadastrar:");
            int numeroDeFuncionarios = sc.nextInt();
            if (numeroDeFuncionarios < 0) {
                System.out.println("Número de funcionários deve ser maior que zero!");
            } else {
                for (int i = 1; i <= numeroDeFuncionarios; i++) {
                    System.out.println("Funcionario " + i);
                    System.out.println("O funcionario eh tercerizado? [1]-SIM [0]-NÃ0");
                    int escolhaDoFuncionario = sc.nextInt();

                    if (escolhaDoFuncionario == 1) {
                        System.out.println("Entre com o nome:");
                        String nome = sc.next();
                        System.out.println("entre com as horas trabalhadas:");
                        int horas = sc.nextInt();
                        System.out.println("Entre com o valor da hora:");
                        double valorDaHora = sc.nextDouble();
                        System.out.println("Entre com o valor da despesa adicional:");
                        double despesaAdicional = sc.nextDouble();
                        if (horas > 0 && valorDaHora > 0 && despesaAdicional >= 0) {
                            Funcionario f1 = new FuncionarioTercerizado(nome, horas, valorDaHora, despesaAdicional);
                            funcionarios.add(f1);

                        }

                    } else if (escolhaDoFuncionario == 0) {
                        System.out.println("Entre com o nome:");
                        String nome = sc.next();
                        System.out.println("entre com as horas trabalhadas:");
                        int horas = sc.nextInt();
                        System.out.println("Entre com o valor da hora:");
                        double valorDaHora = sc.nextDouble();
                        if (horas > 0 && valorDaHora > 0) {
                            Funcionario f1 = new Funcionario(nome, horas, valorDaHora);
                            funcionarios.add(f1);

                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Digite um dado valido!!");
        }
        System.out.println(funcionarios);

        sc.close();
    }
}
