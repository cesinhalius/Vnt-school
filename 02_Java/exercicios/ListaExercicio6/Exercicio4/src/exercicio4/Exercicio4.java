package exercicio4;

import java.util.Scanner;

/**
 * Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e
 * imprima o resultado. Regra: Durante o semestre o aluno faz 3 avaliações com
 * notas de 0 a 10. É considerado aprovado, o aluno que consegue nota igual ou
 * superior a 7. Se este ficar com nota menor que 7 e maior ou igual a 5, será
 * considerado de recuperação. No entanto, se a nota for abaixo de 5, o aluno
 * será considerado reprovado e deverá repetir o semestre.
 *
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a nota da primeira prova: ");
        double p1 = sc.nextDouble();
        System.out.println("Entre com a nota da segunda prova: ");
        double p2 = sc.nextDouble();
        System.out.println("Entre com a nota da terceira prova: ");
        double p3 = sc.nextDouble();

        double media = (p1 + p2 + p3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovado com a nota %.1f%n" , media);
        } else {
            if (media < 7 && media >= 5) {
                System.out.printf("Esta de Recuperacao com a nota de %.1f%n" , media);
            } else {
                if (media < 5) {
                    System.out.println("Esta Reprovado e devera repetir o semestre ");
                }
            }

        }

    }

}
