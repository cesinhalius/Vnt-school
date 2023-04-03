package exercicio3;

class Mamifero extends Animal{

    protected String corPelo;

    @Override
    void locomover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void alimentar() {
        System.out.println("Tomando leite"); 
    }

    @Override
    void emitirSom() {
        System.out.println("som do mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
