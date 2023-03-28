package exercicio6;

class Funcionario {

    private String nome;
    private double salarioLiquido;
    private double salarioBruto;

    
      double descontoImposto(double Dporcentagem){
          return salarioLiquido = salarioBruto - (salarioBruto * (Dporcentagem / 100));
      }  
    
    

    double aumentoSalario(double porcentagem) {
        return salarioBruto = salarioBruto + (porcentagem * salarioBruto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioliquido) {
        this.salarioLiquido = salarioliquido;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
