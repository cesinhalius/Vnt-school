package exercicio1;

import java.util.Scanner;

/**
 *
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean confereInfo;
        double deposito;
        String name;
        int nConta;

        do {
            System.out.println("Digite o numero da conta:");
            nConta = sc.nextInt();
            System.out.println("Digite o nome do cliente:");
            name = sc.next();
            System.out.println("Digite o valor para fazer o primeiro deposito:");
            deposito = sc.nextDouble();
            if(nConta<= 0 || deposito < 0){
                System.out.println("Por favor digite a informacao correta");
                confereInfo =false;
            }else{
                confereInfo =true;
            }
                

        } while (!confereInfo);
        Conta c1 = new Conta(nConta, name);
        
        System.out.println(c1.getNumeroConta());
        System.out.println(c1.getProprietario());
        System.out.printf("R$%.2f%n" , c1.getBalanco());
        c1.depositar(250);
        System.out.printf("R$%.2f%n" , c1.getBalanco());
        c1.sacar(300);
        System.out.printf("R$%.2f%n" , c1.getBalanco());
        
        
        
        
        
    }

}
