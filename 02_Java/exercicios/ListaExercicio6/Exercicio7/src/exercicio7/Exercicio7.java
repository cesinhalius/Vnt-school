package exercicio7;

import java.util.Scanner;

/**
 * Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usuário
 * escolher a operação matemática que ele deseja (soma, subtração, multiplicação
 * e divisão). Após a escolha da operação desejada, o resultado deve ser
 * impresso na tela. O usuário deve ler dois números para fazer uso da
 * calculadora
 *
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor :");
        int num1 = sc.nextInt();
        System.out.println("Entre com outro valor :");
        int num2 = sc.nextInt();
        
        
        System.out.println(" ");
        System.out.println("[1] adicao");
        System.out.println("[2] subtracao");
        System.out.println("[3] multiplicacao");
        System.out.println("[4] divisao");
        System.out.println(" ");
        System.out.print("Qual operacao que voce deseja fazer:");
        int operacao = sc.nextInt();
        int result;
        
        
        switch (operacao){
            case 1:
                result = num1 + num2;
                System.out.println("Resultado eh "+ result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Resultado eh "+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Resultado eh "+ result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Resultado eh "+ result);
                break;
                
        }
    }

}
