package exercicio3;
/*       Crie um programa que contenha três classes conforme apresentado no diagrama ao lado.
        O programa deve apresentar duas pessoas contendo nome,
        a linguagem de programação que trabalha e quantos anos de experiência.
        Faça um contrato através da interfac
        e e depois implemente os métodos.Instancia o objeto Maria que trabalha a 15 anos com Python e 
        João que trabalha a 10 anos com Java.
*/        
public class Exercicio3 {

    public static void main(String[] args) {
        LinguagemProgramacao funcionario1 = new LinguagemProgramacao("Maria", "Python", 15);
        LinguagemProgramacao funcionario2 = new LinguagemProgramacao("Joao", "Java", 10);
        
        
        
        funcionario1.pessoa();
        funcionario1.linguagemProgramacao();
        funcionario1.experiencia();
        
        System.out.println("-----------------------------------------------------------");
        
        funcionario2.pessoa();
        funcionario2.linguagemProgramacao();
        funcionario2.experiencia();
    }

}
