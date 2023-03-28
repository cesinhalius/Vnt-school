package exercicio4;

public class LinguagemProgramacao implements Linguagem {

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
        System.out.printf("Funcionário: %s%n", nome);
    }

    @Override
    public void experiencia() {
        System.out.printf("Tempo de experiência: %d anos %n", experiencia);
    }

    @Override
    public void linguagemProgramacao() {
        System.out.printf("Linguagem que trabalha: %s%n", linguagem);
    }

}
