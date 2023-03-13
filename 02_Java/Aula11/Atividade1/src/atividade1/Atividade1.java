package atividade1;

/**
 *
 * Crie um algoritmo que leia um vetor de tamanho 4.Inicialize o vetor com o
 * usuário digitando os valores de cada elemento. Inicie a soma desse vetor com
 * uma variável num=10.
 */
public class Atividade1 {

    public static void main(String[] args) {
        int[] v = {1,2,3,4};
        int num = 10;
        
        for (int i = 0; i < v.length; i++) {
            num = num + v[i];
            
            System.out.println("Elemento " + i + " : " + num);
        }
    }

}
