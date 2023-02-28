
package exercicio_6;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas no mês, 
 * o valor que recebe por hora e calcular o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais
 * 
 * Entrada: 1, 160, 50 Saída:NUMERO = 1, SALARIO = R$ 8000.00
 */
public class Exercicio_6 {

    
    public static void main(String[] args) {
        double valor_h;
        double salario;
        int hora_t;
        int num_trabalhador;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite seu numero:");
        num_trabalhador = sc.nextInt();
        System.out.println("Digite sua hora trabalhada:");
        hora_t = sc.nextInt();
        System.out.println("Digite o valor do seu trabalho:");
        valor_h = sc.nextDouble();
        
        
        salario = hora_t * valor_h;
        
        System.out.printf("Entrada: " + num_trabalhador + ", " + hora_t + ", " + valor_h
        + "    " + "Saida: NUMERO=" + num_trabalhador + ", SALARIO =R$ %.2f%n", salario);
        
        
    }
    
}
