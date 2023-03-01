package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int x = sc.nextInt();
        System.out.println("Entre com outro numero: ");
        int y = sc.nextInt();
        
        int result;
        
        result = x > y ? x + y : x < y ? x - y : 0;
        
        System.out.println("Resultdo eh " + result);
    }

}
