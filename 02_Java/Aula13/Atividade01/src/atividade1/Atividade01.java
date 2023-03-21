package atividade1;

/**
 *
 *
 */
public class Atividade01 {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.cor = "Preto";
        c1.modelo = "Renegate";
        c1.velocidade = 60;
        c1.Acelerar();
        c1.Frear();
        c1.acenterFarol();
        System.out.println("----------------------------------");
        
        
        
        Carro c2 = new Carro();
        c2.cor = "Vermelho";
        c2.modelo = "celta";
        c2.velocidade = 0;
        c2.Acelerar();
        c2.Frear();
        c2.acenterFarol();
        
        System.out.println("------------------------------------");
        
        Carro c3 = new Carro();
        c3.cor = "Vermelho";
        c3.modelo = "celta";
        c3.velocidade = 80;
        c3.Acelerar();
        c3.Frear();
        c3.acenterFarol();
        
        System.out.println("------------------------------------");
    }

}
