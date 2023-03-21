package atividade2;

/**
 *
 * Faça um algoritmo que crie uma classe candidatura que contenha o nome do
 * candidato, a vaga desejada e a pretensão salarial. Imagine que exista duas
 * possíveis vagas, TECNOLOGIA e GERAL. Consequentemente dois testes diferentes.
 * Crie um método que identifique a vaga na qual o candidato se manifestou. Para
 * cada objeto criado, faça uma breve apresentação do candidato e imprima qual
 * teste deverá ser realizado (Teste de Tecnologia ou Teste Geral).
 */
public class Atividade2 {

    public static void main(String[] args) {
        
        Candidatura c1 = new Candidatura();
        c1.nomeCanditado = "Cesar";
        c1.vagaDesejada = "TECNOLOGIA";
        c1.pretensaoSalarial = 13.000;
        c1.status();
        c1.enviarTeste();
        
        System.out.println(" ");
        
        Candidatura c2 = new Candidatura();
        c2.nomeCanditado = "Ana";
        c2.vagaDesejada = "GERAL";
        c2.pretensaoSalarial = 8.000;
        c2.status();
        c2.enviarTeste();
    }

}
