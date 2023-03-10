package exercicio2;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        char opcao;
        
        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("Entre com o primeiro numero:");
            int numero = sc.nextInt();
            int fatorial = 1;
            

            /*for(int i = 1; i<=numero; i++){
             fatorial = fatorial * i; 
         }
         System.out.println(fatorial);
             */
            do {
                fatorial = fatorial * numero;
                numero--;

            } while (numero >= 1);
            
            System.out.println("Resultado eh : " + fatorial);
            System.out.println("Deseja continuar? [s/n]");
            opcao = sc.next().charAt(0);
        } while (opcao != 'n' );

    }

}
