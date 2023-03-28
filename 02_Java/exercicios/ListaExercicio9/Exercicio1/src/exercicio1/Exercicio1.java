package exercicio1;

import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
 * (suponha medidas válidas), conforme diagrama ao lado. Em seguida, mostrar o
 * valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a
 * maior área. A fórmula para calcular a área de um triângulo a partir das
 * medidas de seus lados a, b e c é a seguinte fórmula de Heron.
 * Use os conceitos
 * de classes e objetos.
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo X = new Triangulo();
        System.out.println("Informe o tamanho do ponto A");
        X.a = sc.nextDouble();
        System.out.println("Informe o tamanho do ponto B");
        X.b = sc.nextDouble();
        System.out.println("Informe o tamanho do ponto C");
        X.c = sc.nextDouble();
        
        System.out.printf("A area eh:%.2f%n",X.area());
        
        
        /*
        Triangulo Y = new Triangulo();
    */
    
    
    
    }

}
