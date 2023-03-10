package exercicio3;

import java.util.Scanner;

/**
 *
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
 * de Npessoas. Faça um algoritmo que calcule e escreva:A maior altura das N
 * pessoas; O número de homens entre as N pessoas. Use estrutura condicional Do
 * While.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant, Nhomens, Nmulher;
        double maior;
        char sexo;

        maior = 0;
        Nhomens = 0;
        Nmulher = 0;
        

        System.out.println("Digite o numero de pessoas para avaliar: ");
        quant = sc.nextInt();
        System.out.println("Digite a altura e o sexo das pessoas: ");
        do {
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            System.out.println("Sexo: (m - mulher e h-homem)");
            sexo = sc.next().charAt(0);
            System.out.println("--------------");

            if (sexo == 'h') {
                Nhomens++;
            } else {
                if (sexo == 'm') {
                    Nmulher++;
                }
            }
            
            if(altura > maior){
                maior = altura;
            }

            quant--;

        } while (quant != 0);
        
        System.out.println("Altura maior eh " + maior + " quantidade de homens " + Nhomens + " quantidade de mulheres " + Nmulher);
    }

}
