
package exercicio1;

public class Triangulo {
    double a;
    double b;
    double c;
    
    double area(double x,double y, double z){
      double p = (x + y + z) / 2;
      
      return Math.sqrt(p * (p-x)*(p-y)*(p-z));
    }
}
