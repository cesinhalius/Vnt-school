package exercicio2;

class Carro {

    private String cor, marca;
    private int ano, marcha;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro() {
        this.marcha = 0;
        this.ligado = false;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    
    
    
    void ligar(){
        if (ligado != true) {
            ligado = true;
            System.out.println("O carro esta ligado.");
        }
    }
    void desligar(){
        if(ligado != false){
            ligado = false;
            System.out.println("Carro esta desligado.");        
        }
    }
    double acelerar(){
       if(velocidadeAtual < velocidadeMaxima){
           velocidadeAtual+=10;
       } 
       return velocidadeAtual;
    }
    void pegarMarcha(){
        if(velocidadeAtual < 0){
            setMarcha(-1);
        }else if(velocidadeAtual == 0){
            setMarcha(0);
        }else if(velocidadeAtual < 40){
            setMarcha(1);
        }else if(velocidadeAtual >= 40 && velocidadeAtual<=80){
            setMarcha(2);
        }else{
            setMarcha(3);
        }
    }
}
