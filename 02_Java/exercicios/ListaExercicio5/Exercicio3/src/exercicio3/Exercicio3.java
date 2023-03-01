package exercicio3;

public class Exercicio3 {
/*
    A) Desenvolva o código,utilizando operador de atribuição com divisão, para resolver o seguinte problema: 
    A variável y recebe inicialmente o valor 5 (valor flutuante) e deve ser dividido pelo valor 3.0. Qual o resultado printado?
    
    B) Resolva o mesmo problema com a variável y sendo um valor inteiro.
    */
    public static void main(String[] args) {
        double y = 5;
        double result = y /= 3;

        System.out.printf("Resultado eh %.2f%n",result);


        int a =5;
        int r = a /= 3;
        
        System.out.println("Resultado eh " + r);
    }

}
