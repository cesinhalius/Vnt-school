package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setCor("preto");
        c1.setMarca("fusca");
        c1.setVelocidadeAtual(0);
        c1.setVelocidadeMaxima(200);
        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.pegarMarcha();

        if (c1.isLigado() != false) {
            System.out.println("Seu carro esta na velocidade " + c1.getVelocidadeAtual() + "KM/h e na marcha " + c1.getMarcha());
        }

        c1.desligar();

    }

}
