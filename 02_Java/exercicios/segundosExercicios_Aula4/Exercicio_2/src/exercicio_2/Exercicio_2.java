/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_2;

import java.util.Scanner;

/**
 *
 * Crie um algoritmo que leia o ano atual e o ano em que uma pessoa nasceu. 
 * Calcule a idade dessa pessoa e imprima o resultado na tela.
 */
public class Exercicio_2 {

   
    public static void main(String[] args) {
       int anoAtual;
       int anoNasceu;
       int idade;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite o ano atual:");
        anoAtual = sc.nextInt();
        System.out.println("Digite o ano que voce nasceu:");
        anoNasceu = sc.nextInt();
        
        idade = anoAtual - anoNasceu;
        
        System.out.println("Voce tem " + idade + " Anos");
        
       
    }
    
}
