package exercicio3;

/**
 *
 * Um funcionário de uma empresa recebe,anualmente, aumento salarial. Sabe-se
 * que: 
 * a)esse funcionário foi contratado em 2016, comsalário inicial de
 * R$2.000,00; 
 * b) Em 2017, elerecebeu aumento de 1,5%, sobre o seu
 * salário inicial; 
 * c) A partir de 2018 (inclusive), osaumentos salariais sempre
 * corresponderam aodobro do percentual do ano anterior. 
 * Faça um programa que determine o salário desse funcionário dos anos de 
 * 2016 ao ano atual(2022). Apresente todos os valores. 
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Salario salarioI = new Salario();
        int ano = 2016;
        
        salarioI.valor = 2000.00;
        
        while(ano <= 2022){
            if(ano == 2017){
                salarioI.aumentodesalario();
            }
            
            
            if(ano >= 2018){
                salarioI.aumentoemdobro();
            }
            
            System.out.printf(ano + "  " +"%.1f%n",salarioI.valor);
            ano++;
        }
    }

}
