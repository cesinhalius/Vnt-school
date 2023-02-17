/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_4;

import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * Faça um programa para ler o valor do raio de um círculo, e 
 * depois mostrar o valor da área deste círculo com duas e quatro casas decimais 
 * conforme exemplos.
 * 
 * Entrada:2.00  Saída:A=12.57
 */
public class Exercicio_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio;
        double Valor_a;
        
        
        System.out.println("Digite o raio do circulo:");
        raio = sc.nextDouble();
        Valor_a =  Math.PI * Math.pow(raio, 2);
        
        System.out.printf("Entada:" + raio + " " + "Saida: A = "+ "%.2f%n" , Valor_a );
        System.out.printf("Entada:" + raio + " " + "Saida: A = " + "%.4f%n" , Valor_a );
        
    }
    
    
    
}
