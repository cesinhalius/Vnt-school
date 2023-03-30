package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Entre com os devidos dados de cada conta. Número da conta, nome do
 * proprietário, o empréstimo realizado (ou não) e o balanço final.
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean verificador = false;
        double deposito = 0;
        int opcao;
        
        ContaJuridica conta = new ContaJuridica(deposito);
        
        do {
            verificador = true;
            System.out.println("Entre com o numero da nova conta: ");
            conta.setNumeroConta(sc.nextInt());
            System.out.println("Digite o nome do cliente:");
            conta.setNomeProprietario(sc.next());
            
            if(conta.getNumeroConta() == 0){
                verificador = false;
                System.out.println("Digite um valor correto");
            }
            
        } while (!verificador);
        
        do {
            try {
                System.out.println("Escolha a operação:");
                System.out.println("[1]- Depositar:");
                System.out.println("[2]- Sacar:");
                System.out.println("[3]- Empréstimo:");
                System.out.println("[4]- Mostrar balanço:");
                System.out.println("[5]- Sair:");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor do deposito:");
                        conta.deposito(sc.nextDouble());
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque:");
                        conta.saque(sc.nextDouble());
                        break;
                    case 3:
                        System.out.println("Digite o valor do emprestimo:");
                        conta.Emprestimo(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("Balanco:");
                        System.out.printf("Valor da sua conta eh %.2f%n" ,conta.getBalanco());
                        break;
                    case 5:
                        System.out.println("Obrigado!, " + conta.getNomeProprietario());

                        verificador = true;
                        
                        break;
                    default:
                        System.out.println("Por favor escolha uma opção válida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Favor digitar valores válidos!");
                sc.next();
            }
        } while (!verificador);

    }

}
