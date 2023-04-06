package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        ContaBanco bc = new ContaBanco();
        ContaBanco b = new ContaBanco();
        double valor;
        
        bc.abrirConta();
        bc.setTipo("CC")  ;
        bc.setNumconta(0001);
        bc.setNomeDono("Joao Silva");
        valor = 300.00;
        bc.depositar(valor);
        System.out.printf("A conta corrente " + bc.getNumconta() + " do " + bc.getNomeDono() + " vai precisar depositar R$%.2f%n", valor);

        b.abrirConta();
        b.setTipo("CP")  ;
        b.setNumconta(0002);
        b.setNomeDono("Maria Silva");
        valor = 400.00;
        b.depositar(valor);
        System.out.printf("A conta corrente " + b.getNumconta() + " da " + b.getNomeDono() + " vai precisar depositar R$%.2f%n", valor);


       

       

    }
}
