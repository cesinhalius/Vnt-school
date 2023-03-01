package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    /*
    Escreva um algoritmo que leia três lados quaisquer. Identifique se esses lados podem formar um triângulo. 
    Caso os lados formem um triângulo, identifique se o triângulo é equilátero, escaleno ou isóceles.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com valor para A:");
        double a = sc.nextDouble();
        System.out.print("Entre com valor para B:");
        double b = sc.nextDouble();
        System.out.print("Entre com valor para C:");
        double c = sc.nextDouble();
        
        if((a+b)>c && (a+c)>b && (b+c)>a){
            if(a == b && b == c && c==a){
                System.out.println("Triangulo Equilatero");
            }else{
                if(a != b && b != c && c != a){
                    System.out.println("Triangulo Escaleno");
                }else{
                    if(a==b && b==c){
                        System.out.println("Triangulo Isoceles");
                    }
                }
            }
        }else{
                System.out.println("Nao eh Triangulo ");
        }

    }

}
