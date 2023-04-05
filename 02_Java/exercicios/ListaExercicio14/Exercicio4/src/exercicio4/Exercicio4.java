package exercicio4;

import java.util.*;

/**
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
 * salario) de N funcionários. Não deve haver repetição de id. Em seguida,
 * efetuar o aumento de X por cento no salário de um determinado
 * funcionário.Para isso, o programa deve ler um id e o valor X. Se o id
 * informado não existir, mostrar uma mensagem e abortar a operação.Ao final,
 * mostrar a listagem atualizada dos funcionários, conforme exemplos no próximo
 * slides.Lembre-se de aplicar a técnica de encapsulamento para não permitir que
 * o salário possa ser mudado livremente. Um salário só pode ser aumentado com
 * base em uma operação de aumento por porcentagem dada.
 *
 */
public class Exercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        try {

            System.out.println("Quantos funcionários serão registrados?");
            int numeroDeFuncionarios = sc.nextInt();
            if (numeroDeFuncionarios <= 0) {
                System.out.println("Valor não pode ser menor ou igual a zero!");

            } else {
                cadastrarFuncionario(numeroDeFuncionarios);
            }

            for (int i = 1; i <= numeroDeFuncionarios; i++) {
                System.out.println("Deseja realizar um aumento? [1]-SIM [0]-NÃO");
                int escolha = sc.nextInt();
                if (escolha == 1) {
                    System.out.println("Entre com o Id do funcionário que vai receber aumento:");
                    int idAumento = sc.nextInt();
                    System.out.println("Entre com a porcentagem:");
                    int porcentagem = sc.nextInt();

                    for (Funcionario item : funcionarios) {
                        if (item.getId() == idAumento) {
                            item.aumentoSalario(porcentagem);
                        }
                    }
                } else {

                    imprimirLista();

                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Valores inválidos!");

        }
        sc.close();

    }

    public static void imprimirLista() {
        System.out.println("Lista de funcionarios:");
        for (Funcionario item : funcionarios) {
            System.out.printf("%d, %s, %.2f%n", item.getId(), item.getNome(), item.getSalario());
        }
    }

    public static void cadastrarFuncionario(int numFunc) {
        int id;
        try {
            for (int i = 1; i <= numFunc; i++) {
                System.out.println("Funcionario #" + i);
                System.out.println("Id:");
                id = sc.nextInt();
                System.out.println("Nome: ");
                String nome = sc.next();
                System.out.println("Salario: ");
                double salario = sc.nextDouble();

                if (funcionarios.isEmpty()) {
                    Funcionario func1 = new Funcionario(id, nome, salario);
                    funcionarios.add(func1);
                } else {
                    for (int j = 0; j < funcionarios.size(); j++) {
                        if (funcionarios.get(j).getId().equals(id)) {
                            System.out.println("Esse id ja esta cadastrado no sistema");
                            break;
                        } else {
                            if (j == funcionarios.size() - 1) {
                                Funcionario f1 = new Funcionario(id, nome, salario);
                                funcionarios.add(f1);
                                break;
                            }
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {

            System.out.println("Valores invalidos!");
        }
    }

}
