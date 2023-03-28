package exercicio2;

public class Quadrado implements Forma {

  private double lados;
  




    @Override
    public String getNomeForma() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lados *lados;
    }

    @Override
    public double getPerimetro() {
        return lados * 4;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
    
    

}
