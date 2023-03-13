package exercicio5;

import java.util.Scanner;

/**
 * Um grande empresa deseja determinar qual de seus produtos tem a preferência
 * de seus clientes. Escreva um algoritmo para ler o tipo de produto comprado
 * (codificado da seguinte forma: 1.ProdutoA 2.ProdutoB 3.ProdutoC 4.Fim). Caso
 * o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
 * solicitado um novo código (até que seja válido). O programa será encerrado
 * quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO
 * OBRIGADO" e a quantidade de clientes que compraram cada tipo de produto.
 *
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int quant = 0;
        int ProdutoA = 0;
        int ProdutoB = 0;
        int ProdutoC = 0;

        do {
            System.out.println("Ola Cliente");
            System.out.println("--------------");
            System.out.println("1 - ProdutoA");
            System.out.println("2 - ProdutoB");
            System.out.println("3 - ProdutoC");
            System.out.println("4 - Sair");
            System.out.println("Digite uma das opcao:");
            opcao = sc.nextInt();

            if (opcao == 1) {
                ProdutoA++;
            } else {
                if (opcao == 2) {
                    ProdutoB++;
                } else {
                    if (opcao == 3) {
                        ProdutoC++;
                    }
                }
            }
            quant++;
        } while (opcao != 4);
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Total de clientes: " + quant);
        System.out.println("ProdutoA: " + ProdutoA);
        System.out.println("ProdutoB: " + ProdutoB);
        System.out.println("ProdutoC: " + ProdutoC);
    }

}
