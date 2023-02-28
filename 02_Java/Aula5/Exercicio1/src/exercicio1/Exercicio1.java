
package exercicio1;

import java.util.Scanner;


public class Exercicio1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        String voto = ((idade >= 16 && idade < 18) && (idade < 18)) ? "Eh Opcional" : "Nao Eh Opcional";

        System.out.println(voto);
    }

}
