package exercicio5;

import java.util.Scanner;

/**
 *
 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
 * classe como mostrado no projeto ao lado.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.println("Digite a largura do Retrangulo:");
        r.largura = sc.nextDouble();
        System.out.println("Digite a altura do Retrangulo:");
        r.altura = sc.nextDouble();
        
        double area = r.Area();
        double perimetro = r.Perimetro();
        double diagonal = r.Diagonal();
        
        
        System.out.println("A Area eh: " + area);
        System.out.println("O Perimetro eh: " + perimetro);
        System.out.printf("A Diagonal eh: %.2f%n" , diagonal);
    }

}
