
package exercicio3;


public class LinguagemProgramacao implements Linguagem{

    public String nome;
    public String linguagem;
    public int experiencia;

    public LinguagemProgramacao(String nome, String linguagem, int experiencia) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.experiencia = experiencia;
    }
   
    @Override
    public void pessoa() {
        System.out.printf("Pessoa: %s%n" ,nome);
    }

    @Override
    public void experiencia() {
        System.out.printf("Tempo de experiencia:  %d anos %n" , experiencia);
    }

    @Override
    public void linguagemProgramacao() {
        System.out.printf("Linguagem de programacao que trabalha: %s%n" , linguagem);
    }
    
}
