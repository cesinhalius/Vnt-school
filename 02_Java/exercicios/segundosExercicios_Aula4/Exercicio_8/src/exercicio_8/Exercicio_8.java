
package exercicio_8;

import java.util.Scanner;

/**
 *
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
 * Em seguida, calcule e mostre: 
 * a) a área do triângulo retângulo que tem A por base e C por altura. 
 * b) a área do círculo de raio C (pi = 3.14159). 
 * c) a área do trapézio que tem A e B por bases e C por altura. 
 * d) a área do quadrado que tem lado B. 
 * e) a área do retângulo que tem lados A e B.
 */
public class Exercicio_8 {

    
    public static void main(String[] args) {
       double A,B,C;
       double A_triangulo;
       double A_circulo;
       double A_trapezio;
       double A_quadrado;
       double A_retangulo;        
       Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Digite um valor para A: ");
        A = sc.nextDouble();
        
        System.out.println("Digite um valor para B: ");
        B = sc.nextDouble();
        
        System.out.println("Digite um valor para C: ");
        C = sc.nextDouble();
        
        
        A_triangulo = (A * C) / 2;
        
        A_circulo = Math.PI * Math.pow(C, 2);
        
        A_trapezio = ((A + B) * C) / 2;
        
        A_quadrado =  B * B;
        
        A_retangulo = A * B;
        
        
        System.out.printf(" Entrada: " + A + ", "+ B +", " + C + "    " + "Saida: TRINGULO:%.3f%n " , A_triangulo);
        System.out.printf("Entrada: " + A + ", "+ B +", " + C + "    " + "Saida: CIRCULO:%.3f%n " , A_circulo);
        System.out.printf("Entrada: " + A + ", "+ B +", " + C + "    " + "Saida: TRAPEZIO:%.3f%n " , A_trapezio);
        System.out.printf("Entrada: " + A + ", "+ B +", " + C + "    " + "Saida: QUADRADO:%.3f%n " , A_quadrado);
        System.out.printf("Entrada: " + A + ", "+ B +", " + C + "    " + "Saida: RETANGULO:%.3f%n " , A_retangulo);
        
    }
    
}
