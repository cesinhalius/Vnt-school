package exercicio7;



/**
 * Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se
 * que: a) esse funcionário foi contratado em 2010, com salário inicial de
 * R$2.000,00; b) Em 2011, ele recebeu aumento de 1,5%, sobre o seu salário
 * inicial; c) A partir de 2012 (inclusive), os aumentos salariais sempre
 * corresponderam ao dobro do percentual do ano anterior. Faça um programa que
 * determine o salário desse funcionário dos anos de 2010 à 2022. Apresente
 * todos os valores.
 *
 */
public class Exercicio7 {

    public static void main(String[] args) {
        
        double salario = 2000.00 , novoSalario = 0, percentual;
        
        percentual = (1.5 / 100);
        
        
        
        for (int i = 2010; i <= 2022; i++) {
            if(i == 2011){
               novoSalario = salario + (percentual * salario); 
            }else{
                if(i == 2012){
                    percentual = percentual * 2;
                    novoSalario = novoSalario + (percentual * novoSalario);
                }
            }
           
            
           System.out.println("Novo salario: " + novoSalario);    
        }
        
        

    }
}
