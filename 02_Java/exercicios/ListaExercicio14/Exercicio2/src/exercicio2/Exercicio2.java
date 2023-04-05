package exercicio2;

import java.util.*;

/**
 * O instrutor Josépossui três cursos A, B e C, e deseja saber seu número total
 * de alunos. Seu programa deve ler os alunos dos cursos A, B e C do instrutor
 * José, depois mostrar a quantidade total e alunos dele
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> codigoAluno = new TreeSet<>();

        System.out.println("Quantos alunos tem no curso A");
        int quantA = sc.nextInt();

        int codAluno;

        //Alunos do curso A: 
        for (int i = 1; i <= quantA; i++) {
            System.out.println("Digite o codigo do " + i + " aluno ");
            codAluno = sc.nextInt();
            codigoAluno.add(codAluno);
        }

        //Alunos do curso B: 2
        System.out.println("Quantos alunos tem no curso B");
        int quantB = sc.nextInt();

        for (int i = 1; i <= quantB; i++) {
            System.out.println("Digite o codigo do " + i + " aluno ");
            codAluno = sc.nextInt();
            codigoAluno.add(codAluno);

        }

        //Alunos do curso C: 3
        System.out.println("Quantos alunos tem no curso C");
        int quantC = sc.nextInt();

        for (int i = 1; i <= quantC; i++) {
            System.out.println("Digite o codigo do " + i + " aluno ");
            codAluno = sc.nextInt();
            codigoAluno.add(codAluno);

        }

        System.out.println("Total de alunos eh : " + codigoAluno.size());
    }

}
