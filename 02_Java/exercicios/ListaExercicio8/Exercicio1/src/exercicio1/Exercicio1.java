package exercicio1;

import java.util.Scanner;

/**
 * Crie um programa que leia o nome de 5 alunos de uma classe. Leia as notas de
 * duas provas de cada aluno, calcule a média da turma e imprima o resultado.
 * Por fim, diga quais alunos possui a média maior que a média da turma.
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] media = new double[5];
        double MTurma, sMedia = 0;

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Entre com o nome: ");
            nome[i] = sc.next();
            System.out.println("Nota da primeira prova:");
            nota1[i] = sc.nextDouble();
            System.out.println("Nota da segunda prova:");
            nota2[i] = sc.nextDouble();
            System.out.println("Media");
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println(media[i]);

            sMedia = sMedia + media[i];
        }
        MTurma = sMedia / 5;

        System.out.println("A media da turma e " + MTurma);
        System.out.println("  ");
        System.out.println("Alunos que ficaram acima da media");
        System.out.println("   ");
        
        for (int i = 0; i < 5; i++) {
            if(media[i] > MTurma){
                System.out.println(nome[i] + "\t" + media[i]);
            }
        }
        
        sc.close();

    }

}
