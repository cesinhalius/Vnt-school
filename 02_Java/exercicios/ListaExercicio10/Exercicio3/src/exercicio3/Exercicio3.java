package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacaoMatematica om = new OperacaoMatematica();
        
        System.out.println("Digite um numero:");
        int n = sc.nextInt();
        
        om.PositivoOuNegativo(n);
        om.ParOuImpar(n);
        
        
    }

}
