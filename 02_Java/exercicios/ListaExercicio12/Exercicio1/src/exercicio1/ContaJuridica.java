package exercicio1;

public class ContaJuridica extends Conta{
    // Atributo
    
    private double limiteEmprestimo = 2000;
    
    // Herança
    public ContaJuridica(double balanco) {
        super(balanco);
    }
    
    void Emprestimo(double Evalor){
        if(Evalor <= limiteEmprestimo){
            setBalanco(getBalanco() + Evalor);
            System.out.printf("Emprestimo aceito no valor de R$%.2f%n" , Evalor);
        }else{
            System.out.println("Emprestimo negado! tente outro valor " );
        }
    }
    
    
    
    
}
