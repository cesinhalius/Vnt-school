package exercicio2;

import java.util.Scanner;

/**
 * Suponha que um certo estado possui 10 times de futebol em diferentes cidades.
 * A prefeitura pretende promover um campeonato de futebol que tenha jogos de
 * ida e volta. Isso pode valorizar a economia local. Crie um programa que leia
 * no nome dos times e gere uma tabela do campeonato.
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];
        
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome do time:");
            nome[i] = sc.nextLine();
        }
        System.out.println("------------------------------");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i != j){
                    System.out.println(nome[i] + "() X ()" + nome[j]);
                }
            }
        }
        System.out.println("-----------------------------");
        sc.close();

    }
}
