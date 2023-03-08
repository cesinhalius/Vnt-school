package exercicio12;

import java.util.Scanner;

/**
 * Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e
 * positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os
 * valores lidos e:se I = 1, escrever os três valores A, B e C em ordem
 * crescente;se I = 2, escrever os três valores A, B e C em ordem decrescente;se
 * I = 3, escrever os três valores A, B, e C de forma que o maior valor fique
 * entre os outros dois;se I não for um dos três valores acima, dar uma mensagem
 * indicando este comportamento.
 *
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor para I: ");
        int I = sc.nextInt();
        
         System.out.println("Entre com valor para A:");
                double A = sc.nextDouble();
                System.out.println("Entre com valor para B:");
                double B = sc.nextDouble();
                System.out.println("Entre com valor para C:");
                double C = sc.nextDouble();
                double aux;

        switch (I) {
            default:
                System.out.println("Nao tem opcao com esse numero para I");
                break;
            case 1:
               
                if (A > B && A > C) {
                    aux = A;
                    A = C;
                    C = aux;
                    if(A > B){
                        aux = A;
                        A = B;
                        B = aux;
                    }
                    System.out.println(A + "," + B + "," + C);
                } else {
                    if (B > A && B > C) {
                        aux = B;
                        B = C;
                        C = aux;
                        if (A > B) {
                            aux = A;
                            A = B;
                            B = aux;
                        }
                        System.out.println(A + "," + B + "," + C);
                    } else {
                        if (C > A && C > B) {
                            System.out.println(A + "," + B + "," + C);
                        }
                    }
                }
                break;
            case 2:
                
                if (A < B && A < C) {
                    aux = A;
                    A = C;
                    C = aux;
                    System.out.println(A + "," + B + "," + C);
                } else {
                    if (B < A && B < C) {
                        aux = B;
                        B = C;
                        C = aux;
                    if(A < B){
                        aux = A;
                        A = B;
                        B = aux;
                    }    
                        System.out.println(A + "," + B + "," + C);
                    } else {
                        if (C < A && C < B) {
                            System.out.println(A + "," + B + "," + C);
                        }
                    }
                }
                break;
            case 3:
                
                if (A > B && A > C) {
                    aux = A;
                    A = B;
                    B = aux;
                    System.out.println(A + "," + B + "," + C);
                } else {
                    if (B > A && B > C) {
                        System.out.println(A + "," + B + "," + C);
                    } else {
                        if (C > A && C > B) {
                            aux = B;
                            B = C;
                            C = aux;
                            System.out.println(A + "," + B + "," + C);
                        }
                    }
                }
        }
    }

}
