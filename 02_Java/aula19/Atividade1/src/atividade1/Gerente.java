package atividade1;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(int senha) {
        this.senha = senha;
    }

    boolean autenticar(int senhaDigitada){
        if(this.senha == senhaDigitada){
            return true;
        }else{
            return false;
        }
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
