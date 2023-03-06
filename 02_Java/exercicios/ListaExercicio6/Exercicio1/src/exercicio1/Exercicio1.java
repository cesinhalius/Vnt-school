package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    /*
    Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar.
    Imprima o resultado.
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre co um numero: ");
        int n = sc.nextInt();
        
        if(n % 2 == 0){
            System.out.println("O numero e Par");
        }else{
            System.out.println("O numero e Impar");
        }
        
    }

}
