package exercicio8;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Crie um programa que faça um jogo da mega sena de forma randômica. Os números
 * devem ser escolhidos de forma aleatória. Imprima os números em ordem
 * crescente.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Random numeros = new Random();
        int[] jogo = new int[6];

        for (int i = 0; i < jogo.length; i++) {
            for (int j = 1; j <= 5; j++) {
                jogo[i] = numeros.nextInt(61);

                if (jogo[i] == 0 || jogo[i] == jogo[j]) {
                    jogo[i] = numeros.nextInt(61);
                }
            }
        }

        Arrays.sort(jogo);
        
        ImprimirJogo(jogo);

    }

    static void ImprimirJogo(int[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.printf(j[i] + "  ");
        }
    }
    
   

}
