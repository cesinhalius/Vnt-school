
package atividade_2;
import java.util.Scanner;
/**
 *
 * Construa um algoritmo para ler dois números.Em seguida,calcule a 
 * soma,a subtração,a multiplicação e a divisão desses números, armazenando os 
 * resultados em outras variáveis.Imprimir os dados iniciais e os resultados.
 */
public class Atividade_2 {

    
    public static void main(String[] args) {
       
        Double n1,n2;
        Scanner numero = new Scanner(System.in);
        Double soma,subtrair,multiplicar,divdir;
        
        System.out.println("Digite um valor");
        n1 = numero.nextDouble();
        n2 = numero.nextDouble();
        
        //soma
        soma = n1 + n2;

        //subtração
        subtrair = n1 - n2;
        
        //divisão
        divdir = n1 / n2;
        
        //multiplicação
        multiplicar = n1 * n2;
        
        
        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + subtrair);
        System.out.println(n1 + " * " + n2 + " = " + multiplicar);
        System.out.println(n1 + " / " + n2 + " = " + divdir);
    }
    
}
