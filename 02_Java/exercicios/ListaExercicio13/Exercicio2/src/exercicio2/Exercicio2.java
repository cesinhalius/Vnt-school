package exercicio2;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        
        
        try{
        System.out.println("Entre com a quantidade de produtos que deseja cadastrar:");
        int numeroProduto = sc.nextInt();
        if (numeroProduto <= 0) {
            System.out.println("A quantidade deve ser maior que zero!");
        } else {
            for (int i = 1; i <= numeroProduto; i++) {
                System.out.println("[1]- Produto Novo");
                System.out.println("[2]- Produto usado");
                System.out.println("[3]- Produto importado");
                System.out.print("Digite uma opcao");
                int escolha = sc.nextInt();

                if (escolha != 1 && escolha != 2 && escolha != 3) {
                    System.out.println("Opção inválida!");
                    i--;
                } else {
                    System.out.println("Produto: " + i);
                    String nome, dataDeFabricacao;
                    double preco, taxa;

                    switch (escolha) {
                        case 1:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.next();
                            System.out.println("entre com o preço:");
                            preco = sc.nextDouble();
                            produtos.add(new Produto(nome, preco));
                            break;
                        case 2:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.next();
                            System.out.println("Entre com o preço:");
                            preco = sc.nextDouble();
                            System.out.println("Entre com a data de fabricação (dd/MM/yyyy)");
                            dataDeFabricacao = sc.next();
                            produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                            break;
                        case 3:
                            System.out.println("Entre com o nome do produto:");
                            nome = sc.next();
                            System.out.println("Entre com o preço:");
                            preco = sc.nextDouble();
                            System.out.println("Entre com o valor da taxa:");
                            taxa = sc.nextDouble();
                            produtos.add(new ProdutoImportado(nome, preco, taxa));
                            break;
                        default:
                            System.out.println("Selecione uma opção válida!");
                    }
                }
            }
        }
        
        System.out.println("Etiqueta do Produto");
        for (Produto i : produtos) {
             i.etiquetaPreco();
        }

    }catch(Exception e){
            System.out.println("Coloque dados validos");
        
    }
    }

}
