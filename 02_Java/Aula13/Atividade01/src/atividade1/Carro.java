package atividade1;

/**
 *
 *
 */
public class Carro {
    //atributo

    String cor;
    String modelo;
    double velocidade;

    //metodo
    void Acelerar() {
        if (velocidade < 40) {
            velocidade = velocidade + 10;
        } else {
            if (velocidade <= 60) {
                velocidade = velocidade + 5;
            } 

        }
        System.out.println(velocidade + " " +"Acelerando!!");
    }

    void Frear() {
        if (velocidade > 60) {
            velocidade = velocidade - 10;
            System.out.println("Freando!!!");
        } 
    }

    void acenterFarol() {
        if (velocidade == 0) {
            System.out.println("Apagar farol!!");
        } else {
            System.out.println("Acender farol!!");
        }
    }

}
