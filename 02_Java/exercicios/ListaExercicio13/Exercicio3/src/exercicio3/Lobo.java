package exercicio3;

public class Lobo extends Animal{

    @Override
    void locomover() {
        System.out.println("Correndo ");
    }

    @Override
    void alimentar() {
        System.out.println("Alimentando de carne");
    }

    @Override
    void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuuuuuuuuu!!!");
    }

}
