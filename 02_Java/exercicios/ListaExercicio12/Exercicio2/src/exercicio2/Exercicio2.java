package exercicio2;

import java.util.Scanner;

/**
 * Pense no programa quando for executado conforme exemplo ao lado. Veja que
 * inicialmente é perguntado quantas vezes ou número de formas se deseja fazer.
 * Na Forma 1 foi inserido os dados para retângulo e na Forma 2 foi inserido os
 * dados para círculo. Pra cada um dos casos foi perguntado a cor desejada.Tente
 * reproduzir esses valores e chegar nos resultados mostrados de vermelho.
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();
        Circulo c = new Circulo();
        String forma;

        try{
        System.out.println("Entre com o numero de formas:");
        int numeroDeformas = sc.nextInt();
        double[] vetorArea = new double[numeroDeformas];
        
        for (int i = 0; i < numeroDeformas; i++) {
            System.out.println("Forma #" + i + " Dados:");
            System.out.println("Retângulo ou Circulo (r/c)?");
            forma = sc.next();
            
            if ("r".equals(forma)) {
                r.setNome("Retangulo");
                System.out.println("Qual a cor da forma do retangulo:(BLACK/BLUE/RED)");
                r.setCor(Cor.valueOf(sc.next()));
                System.out.println("Entre com valor da altura do retangulo:");
                r.setAltura(sc.nextDouble());
                System.out.println("Entre com valor da largura do retangulo:");
                r.setLargura(sc.nextDouble());
                vetorArea[i] = r.area();

            }else if("c".equals(forma)){
                c.setNome("Circulo");
                System.out.println("Qual a cor da forma do circulo: (BLACK/BLUE/RED");
                c.setCor(Cor.valueOf(sc.next()));
                System.out.println("Entre com valor ao raio do circulo:");
                c.setRaio(sc.nextDouble());
                vetorArea[i] = c.area();
            }
        }
        for (int i = 0; i < vetorArea.length; i++) {
            System.out.printf("Area da Forma: %.2f%n" ,vetorArea[i]);
        }
        }catch(Exception e){
            System.out.println("Digite um valor valido!");
        }
        
        
    }
}
