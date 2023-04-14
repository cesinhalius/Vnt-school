package exercicio3;

public class OperacaoMatematica {
    
    public int num = 5;

   
    
    public void PositivoOuNegativo(){
        if(num >0){
            System.out.println("Numero " + num + "eh positivo");
        }else{
            System.out.println("Numero " + num + "eh positivo");
        }
    }
    
    public void ParOuImpar(){
        if(num%2==0){
            System.out.println("Numero " + num + " eh par");
        }else{
            System.out.println("Numero " + num + " eh impar");
        }
    }
}
