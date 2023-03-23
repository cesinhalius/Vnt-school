package exercicio6;

class Funcionario {
    String nome;
    double imposto;
    double salarioBruto;
    
    
    double salarioLiquido(){
        imposto = imposto / 100;
        
        return salarioBruto - (imposto * salarioBruto);
        
         
    }
    
    double aumentoSalario(double porcentagem){
        porcentagem = porcentagem / 100;
        
        return salarioBruto + (porcentagem * salarioBruto);
    }
}
