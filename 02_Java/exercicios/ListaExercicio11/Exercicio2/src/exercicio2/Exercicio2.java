package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        String unidadeDeMedida = "cm";
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLados(12);
        System.out.println(quadrado1.getNomeForma());
        System.out.printf("Area: %.2f%s%n", quadrado1.getArea(), unidadeDeMedida);
        System.out.printf("Perimetro: %.2f%s%n", quadrado1.getPerimetro(), unidadeDeMedida);
        System.out.printf("lado: %.2f%s%n", quadrado1.getLados(), unidadeDeMedida);
        
        System.out.println("-----------------------------------------------------------------------------");
        
        Triangulo triangulo1 = new Triangulo();
        System.out.println(triangulo1.getNomeForma());
        triangulo1.setBase(5);
        triangulo1.setAltura(15);
        System.out.printf("Area: %.2f%s%n", triangulo1.getArea(), unidadeDeMedida);
        System.out.printf("Perimetro: %.2f%s%n", triangulo1.getPerimetro(), unidadeDeMedida);
    }

}
