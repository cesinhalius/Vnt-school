package exercicio3;

public class Salario {
    double valor;
    double percentual;
    
    
    void aumentodesalario(){
        percentual = (1.5/100);
        valor = valor + (percentual * valor);
        
    }
    
    void aumentoemdobro(){
        percentual = percentual * 2;
        
        valor = valor + (percentual * valor);
        
        
    }
}
