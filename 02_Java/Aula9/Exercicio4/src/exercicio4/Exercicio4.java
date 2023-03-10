package exercicio4;

import java.util.Scanner;

/**
 *
 * Crie um algoritmo que leia o número de alunos na sala de aula para serem
 * avaliados. Cada aluno realiza 3 testes. O professor precisa digitar a nota de
 * cada teste e calcular a média para cada aluno.Apresente a média ponderada
 * para cada um destes conjuntos de 3 notas, sendo que o primeiro valor tem peso
 * 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Imprima o
 * resultado com o nome do aluno e a média ponderada.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos para avaliar?");
        int alunos = sc.nextInt();
        
        for(int i = 0; i < alunos;i++){
            System.out.println("Digite o nome do aluno:");
            String nome = sc.next();
            System.out.println("Digite a primeira nota:");
            double n1 = sc.nextDouble();
            System.out.println("Digite a segunda nota:");
            double n2 = sc.nextDouble();
            System.out.println("Digite a terceira nota:");
            double n3 = sc.nextDouble();
            
            
            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
            
            System.out.println(nome + " Sua media eh " + media);
            
        }
        
    }

}
