package atividade1;

class Motor {

    private boolean ligado;
    private boolean gasolina;

    public Motor(boolean ligado, boolean gasolina) {
        this.ligado = ligado;
        this.gasolina = gasolina;
        
    }
    
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }    
    
    boolean ligar() {
        if (gasolina && !ligado) {
            ligado = true;
            System.out.println("Motor esta ligado");
        }else if(!gasolina){
            ligado = false;
            System.out.println("Motor desligado");
        }else{
            System.out.println("O motor foi ligado!");
        }
        
        return ligado;
    }
    
    boolean temGasolina(){
        return gasolina;
    }

}
