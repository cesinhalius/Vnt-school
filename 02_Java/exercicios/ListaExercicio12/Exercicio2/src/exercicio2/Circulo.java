
package exercicio2;


public class Circulo extends Forma{
    
    private double raio;
    
    @Override
    public double area(){
        return (Math.PI * Math.pow(raio, 2));
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
