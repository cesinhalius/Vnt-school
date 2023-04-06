package exercicio1;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String nomeDono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumconta() {
        return numConta;
    }

    public void setNumconta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void abrirConta() {
        status = "CC".equals(tipo) || "CP".equals(tipo);
        if ("CC".equals(tipo)) {
            setSaldo(50.00);
        } else if ("CP".equals(tipo)) {

            setSaldo(150.00);

        }

    }

    void fecharConta() {
        if (saldo == 0) {
            setStatus(false);
        }
    }

    void depositar(double d) {
        if (getStatus() == true) {
            setSaldo(saldo + d);
        }
    }

    void sacar(double s) {
        if (getStatus() == true && getSaldo() > 0) {
            setSaldo(saldo - s);
        }
    }

    void pegarMensal() {
        if("CC".equals(tipo)){
            setSaldo(saldo - 12.00);
        }else if("CP".equals(tipo)){
            setSaldo(saldo - 20.00);
        }
    }

}
