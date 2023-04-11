package exercicio1;

public class Conta implements ControleConta{
    private int numeroConta;
    private String proprietario;
    private double balanco;

    public Conta(int numeroConta, String proprietario, double balanco) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = balanco;
    }

    public Conta(int numeroConta, String proprietario) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }
    
    
    @Override
    public void depositar(double dValor){
        balanco = balanco + dValor;
    }
    
    @Override
     public void sacar(double sValor){
        balanco = (balanco - sValor) - 5.0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta {");
        sb.append("numero conta = ").append(numeroConta);
        sb.append(", dono conta = '").append(proprietario).append("/");
        sb.append(", balanco = ").append(balanco);
        sb.append("}");
        return sb.toString();
    }

    

    

    

    
    

   
    

    
    
    
}
