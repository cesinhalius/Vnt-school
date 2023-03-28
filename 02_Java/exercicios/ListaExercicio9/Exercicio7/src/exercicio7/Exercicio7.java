package exercicio7;

import java.util.Scanner;

/**
 *
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
 * também se o aluno está APROVADO ou REPROVADO e, em caso negativo, quantos
 * pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da
 * nota). Você deve criar uma classe Estudante para resolver este problema.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante e = new Estudante();
        
        System.out.println("Entre com o seu nome:");
        e.nome = sc.nextLine();
        System.out.println("Entre com a primeira nota:");
        e.nota1 = sc.nextDouble();
        System.out.println("Entre com a segunda nota:");
        e.nota2 = sc.nextDouble();
        System.out.println("Entre com a terceira nota:");
        e.nota3 = sc.nextDouble();
        
        double media = e.Media();
        System.out.printf("Final: %.2f pontos%n", media);
        
        if (media < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Precisa de %.2f Pontos%n",e.pontosFaltando());
            
        }else{
            System.out.println("Aprovado");
        }
        sc.close();
    }
    
    
    
}
