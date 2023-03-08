package exercicio2;

import java.util.Scanner;

/*
 Escreva um programa que leia um número inteiro. Se o número lido for positivo, 
 escreva uma mensagem indicando se ele é PAR ou ÍMPAR. Se o número for negativo, 
 escreva a mensagem “NEGATIVO”.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com um numero: ");
        int num = sc.nextInt();

        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("O numero " + num + " eh Par ");
            } else {

                System.out.println("O numero " + num + " eh Impar ");
            }
        }else{
            System.out.println("Este numero eh negativo");
        }
    }

}
