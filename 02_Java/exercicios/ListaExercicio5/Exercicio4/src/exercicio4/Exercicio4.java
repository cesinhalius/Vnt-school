package exercicio4;

public class Exercicio4 {

    /* Desenvolva o código, utilizando operador de atribuiçã ocom módulo, para resolver o seguinte problema:
    A variável w recebe inicialmente o valor 4. Qual o resto a ser printado, sabendo que a variável será dividida por 3.33?
     */

    public static void main(String[] args) {
        
        double w = 4;
        double result = w %= 3.33;
        int A =(int)result;
        System.out.printf("Resultado eh %.2f%n" , result);
        
        System.out.println("Resultado eh " + A);
        
        
    }

}
