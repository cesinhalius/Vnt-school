package exercicio8;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia as notas das duas provas de cada um dos 3
 * alunos. Leia o nome do aluno e suas respectivas notas. Imprima o resultado
 * dizendo se os alunos foram aprovados(nota >= 6.0) e imprima no final a média
 * da turma.
 *
 */
public class Exercicio8 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int nAluno = 0;
            double mediaT = 0;
            
            do{
            System.out.println("Digite o nome do aluno");
            String nome = sc.next();
            System.out.println("Digite a primeira nota:");
            double nota1 = sc.nextDouble();
            System.out.println("Digite a segunda do nota:");
            double nota2 = sc.nextDouble();
            
            if(nota1 >= 6.0 || nota2 >=6.0){
                System.out.println("O aluno " + nome + " foi aprovado ");
            }else{
                System.out.println("O aluno " + nome + " nao foi aprovado");
            }
            
            mediaT = (nota1 + nota2) / 3;
            
            }while(nAluno != 3);
            
            System.out.println("Media da turma eh: " + Math.round(mediaT));
    }

}
