package exercicio1;

public class FuncionarioTercerizado extends Funcionario{

    private double despesaAdicional;
    
    public FuncionarioTercerizado(String nome, int horas, double valorPorHora, double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public double Pagamento(){
        return getHoras() * getValorPorHora() + (despesaAdicional * 1.1);
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
    

}
