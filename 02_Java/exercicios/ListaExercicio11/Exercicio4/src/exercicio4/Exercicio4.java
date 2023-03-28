package exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        boolean infoCorretas = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entre com o nome:");
                String nome = sc.next();
                System.out.println("Entre com a linguagem que programa:");
                String linguagemDeProgramacao = sc.next();
                System.out.println("Entre com a experiência(anos):");
                int experiencia = sc.nextInt();
                
                LinguagemProgramacao funcionario1 = new LinguagemProgramacao(nome, linguagemDeProgramacao, experiencia);
                funcionario1.pessoa();
                funcionario1.linguagemProgramacao();
                funcionario1.experiencia();

            } catch (InputMismatchException e) {
                System.out.println("Idade deve ser um numero!");
                infoCorretas = false;
            }
        } while (infoCorretas);

    }

}
