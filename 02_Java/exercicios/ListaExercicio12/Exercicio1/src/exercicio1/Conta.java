package exercicio1;

public class Conta {

    private int numeroConta;
    private String nomeProprietario;
    private double balanco;

    public Conta(double balanco) {
        this.balanco = balanco;
    }

    public void deposito(double Dvalor) {
        balanco = balanco + Dvalor;
        System.out.println("Depósito no valor de " + Dvalor + " realizado com sucesso!");
    }

    public void saque(double Svalor) {
        balanco = balanco - Svalor;
        System.out.println("Saque no valor de " + Svalor + " realizado com sucesso!");

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

}
