
package exercicio1;
import java.util.Scanner;

/* Faça um algoritmo para ler a base e a altura de um triangulo retângulo. 
   Em seguida, calcular a sua área. Imprimir: base, altura e aárea.
*/

public class Exercicio1 {

   
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner n = new Scanner(System.in);
        double area;
        System.out.println("Informe o valor da base: ");
        base = n.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura = n.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("A base = " + base);
        System.out.println("A altura = " + altura);
        System.out.println("A area = " + area);
        
        
        
        
        
        
    }
    
}
