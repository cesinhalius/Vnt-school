package exercicio2;

public class Triangulo implements Forma {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    @Override

    public String getNomeForma() {
        return "Triangulo";
    }

    @Override
    public double getArea() {
        if (base > 0 && altura > 0) {
            return (base * altura) / 2;
        } else if (verificaTriangulo()) {
            double semiPerimetro = (lado1 + lado2 + lado3) / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        } else {
            System.out.println("Medida nao formam triangulo");
            return 0;
        }
    }

    @Override
    public double getPerimetro() {
        if (base > 0 && altura > 0) {
            double hipo = Math.sqrt(Math.pow(base, 2) + (Math.pow(altura, 2)));
            return hipo + base + altura;
        } else if (verificaTriangulo()) {
            return lado1 + lado2 + lado3;
        } else {
            return 0;
        }
    }

    public boolean verificaTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

}
