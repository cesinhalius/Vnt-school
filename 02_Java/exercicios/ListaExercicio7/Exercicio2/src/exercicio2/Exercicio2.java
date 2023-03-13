package exercicio2;

import java.util.Scanner;

/**
 *
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida" e "Tente novamente". Quando a senha for informada
 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
 * encerrado. Considere que a senha correta é o valor 2023.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        
        

        do{
            System.out.println("Insira o codigo de acesso:");
            codigo = sc.nextInt();
            if(codigo == 2023){
                System.out.println("Acesso permitido");    
            }else{
                System.out.println("Senha Invalida, tente novamente");
            }
        }while(codigo != 2023); 
        

    }

}
