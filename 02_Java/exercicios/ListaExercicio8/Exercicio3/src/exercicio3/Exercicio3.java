package exercicio3;

import java.util.Scanner;

/**
 *
 * Crie um programaqueverifica se o número é par ou ímpar. A verificação deve ser
 * feita por um método também criado.
 */
public class Exercicio3 {

    public static String ParouImpar(int num){
        if(num % 2 ==0){
            return "numero eh par"; 
        }
        return "numero eh impar";
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int numero = sc.nextInt();
        
        System.out.println(ParouImpar(numero)); 
        
        sc.close();
        
        
    }

}
