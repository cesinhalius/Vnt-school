
package exercicio_7;

import java.util.Scanner;

/**
 *
 * Fazer um programa para ler o código de uma peça 1, 
 * o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 */
public class Exercicio_7 {

   
    public static void main(String[] args) {
      int C_peca_1;
      int C_peca_2;
      int QTD_peca_1;
      int QTD_peca_2;
      double VL_peca_1;
      double VL_peca_2;
      double VL_Total_peca_1;
      double VL_Total_peca_2;
      double VL_Total;
      
      
      
      
      
      
      Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o codigo da peca 1:");
        C_peca_1 = sc.nextInt();
        System.out.println("Digite o codigo da peca 2:");
        C_peca_2 = sc.nextInt();
        System.out.println("Digite quantidade de peca 1:");
        QTD_peca_1 = sc.nextInt();
        System.out.println("Digite quantidade de peca 2:");
        QTD_peca_2 = sc.nextInt();
        System.out.println("Digite o valor da peca 1:");
        VL_peca_1 = sc.nextDouble();
        System.out.println("Digite o valor da peca 2:");
        VL_peca_2 = sc.nextDouble();
        
        
       VL_Total_peca_1 = QTD_peca_1 * VL_peca_1;
       VL_Total_peca_2 = QTD_peca_2 * VL_peca_2;
       
       VL_Total = VL_Total_peca_1 + VL_Total_peca_2;
       
       
       
        
        
        System.out.printf("Entrada: " + C_peca_1 + ", " + QTD_peca_1 + ", " + VL_peca_1 + "     " + "Saida: VALOR A PAGAR: R$ %.2f%n" , VL_Total);       
        System.out.println("Entrada: " + C_peca_2 + ", " + QTD_peca_2 + ", " + VL_peca_2);
        
         
        
        
        
        
    }
    
}
