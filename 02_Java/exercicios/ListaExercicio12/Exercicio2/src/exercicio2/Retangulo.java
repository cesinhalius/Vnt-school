package exercicio2;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    @Override
    public double area() {
        if (altura <= 0 || largura <= 0) {
            System.out.println("Digite um valor maior que zero");
        } 
        return (altura * largura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
