package exercicio1;

public class Funcionario {

    private String nome;
    private int horas;
    private double valorPorHora;
    
    
    public double Pagamento(){
        return horas * valorPorHora;
    }

    public Funcionario(String nome, int horas, double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return  "Funcionario: " + nome + " Total Pagamento: " +  Pagamento();
    }
}
