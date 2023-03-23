package exercicio3;

public class Salario {
    double valor;
    double percentual;
    
    
    double aumentodesalario(double v){
        percentual = (1.5/100);
        valor = v + (percentual * v);
        return valor;
    }
    
    double aumentoemdobro(double x){
        percentual = percentual * 2;
        
        valor = x + (percentual * x);
        
        return valor;
    }
}
