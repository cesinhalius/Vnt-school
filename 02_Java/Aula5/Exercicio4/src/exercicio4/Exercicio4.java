package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o preço:");
        double preco = sc.nextDouble();
        double precoLimite = 30.0;
        double total;
        
        total = preco < precoLimite ? preco - (preco * 0.10) : preco - (preco * 0.20);
        
        
        System.out.println(total);
        
    }

}
