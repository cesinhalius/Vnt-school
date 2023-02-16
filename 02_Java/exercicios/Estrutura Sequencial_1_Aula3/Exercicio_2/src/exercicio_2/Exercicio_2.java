
package exercicio_2;
import java.util.Scanner;
/* Elabore um algoritmo para ler o nome de um aluno, 
sua idade (em anos) e as quatro notas (de quatro bimestres). 
Calcular a média anual do aluno. 
Imprimir: nome, idade, notas e média.
*/

public class Exercicio_2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nome;
       int idade;
       double n1,n2,n3,n4;
       int media;
       
       System.out.println("Digite seu nome:");
       nome = sc.nextLine();
       System.out.println("Digite a sua idade:");
       idade = sc.nextInt();
       System.out.println("Digite sua primeira nota:");
       n1 = sc.nextDouble();
       System.out.println("Digite sua segunda nota:");
       n2 = sc.nextDouble();
       System.out.println("Digite sua terceira nota:");
       n3 = sc.nextDouble();
       System.out.println("Digite sua quarta nota:");
       n4 = sc.nextDouble();
       
       
       
       media = (int) ((n1 + n2 + n3 + n4)/4);
       
       
    System.out.println("nome = " + nome + " idade = " + idade+" anos" + " - " + n1 + " - " + n2 + " - " + n3 + " - " + n4 + " - " + "Sua media = " + media );
                
       
               
      
        
        
    }
    
}
