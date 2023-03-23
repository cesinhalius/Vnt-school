package exercicio5;

class Retangulo {
    double largura;
    double altura;
    
    
    
    double Area(){
        double result = largura * altura;
        
        return result;
    }
    double Perimetro(){
        double p = (largura * 2) + (altura * 2);
        
        return p;
    }
    double Diagonal(){
        double d = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura,2));
        
        return d;
    }
}
