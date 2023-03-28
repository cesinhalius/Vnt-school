package exercicio2;

class Conversor {
    double cotacao;
    double valorDolar;
   
    
    double PagarDolar(){
       return  cotacao * (valorDolar * 1.06);
    }
}
