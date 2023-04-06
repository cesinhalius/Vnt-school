package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Escolha um produto:");
        System.out.println("[1]-Cachorro Quente");
        System.out.println("[2]-X-Salada");
        System.out.println("[3]-X-Bacon");
        System.out.println("[4]-Torrada");
        System.out.println("[5]-Refrigerante");
        int itens = sc.nextInt();
        System.out.println("Digite a quantidade:");
        int quant = sc.nextInt();

        switch (itens) {
            case 1:
                Produto p1 = new Produto();
                p1.setNome("Cachorro Quente");
                p1.setCodigo(1);
                p1.setPreco(7.0);
                p1.setQuantidade(quant);
                System.out.println(p1);
                System.out.printf("Total: %.2f", p1.calcularPagar());
                break;
            case 2:
                Produto p2 = new Produto();
                p2.setNome("X-Salada");
                p2.setCodigo(2);
                p2.setPreco(9.0);
                p2.setQuantidade(quant);
                System.out.println(p2);
                System.out.printf("Total: %.2f", p2.calcularPagar());
                break;
            case 3:
                Produto p3 = new Produto();
                p3.setNome("X-Bacon");
                p3.setCodigo(3);
                p3.setPreco(11.0);
                p3.setQuantidade(quant);
                System.out.println(p3);
                System.out.printf("Total: %.2f", p3.calcularPagar());
                break;
            case 4:
                Produto p4 = new Produto();
                p4.setNome("Torrada");
                p4.setCodigo(4);
                p4.setPreco(5.0);
                p4.setQuantidade(quant);
                System.out.println(p4);
                System.out.printf("Total: %.2f", p4.calcularPagar());
                break;
            case 5:
                Produto p5 = new Produto();
                p5.setNome("Refrigerante");
                p5.setCodigo(5);
                p5.setPreco(4.0);
                p5.setQuantidade(quant);
                System.out.println(p5);
                System.out.printf("Total: %.2f", p5.calcularPagar());
                break;
            default:
                System.out.println("Favor escolher um valor válido!");
        }

    }

}
