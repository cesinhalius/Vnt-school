package atividade1;

/**
 * Crie uma programa que siga as instruções conforme o diagrama de classe ao
 * lado. Crie uma lógigapara a senha e instancieobjetos do tipo funcionário e do
 * tipo Gerente. Veja que a todo momento que for criado um objeto do tipo
 * Gerente, este objeto possuirá também os atributos definidos na classe
 * Funcionario, pois Gerente é um Funcionario!
 *
 */
public class Atividade1 {

    public static void main(String[] args) {
            Gerente g = new Gerente(655);
            
            g.setNome("Cesar");
            g.apresentar();
            
            if(g.autenticar(656)){
                System.out.println("Acesso liberado");
            }else{
                System.out.println("Acesso Negado");
            }
    }

}
