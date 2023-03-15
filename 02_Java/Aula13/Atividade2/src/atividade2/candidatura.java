package atividade2;

public class candidatura {
    // atributos

    String nomeCanditado;
    String vagaDesejada;
    double pretensaoSalarial;

    // metodos
    void status() {
        System.out.println("Nome do candidato: " + this.nomeCanditado);
        System.out.println("Vaga: " + this.vagaDesejada);
        System.out.println("Pretensao Salarial " + this.pretensaoSalarial);
    }

    void enviarTeste() {
        if (vagaDesejada == "TECNOLOGIA") {
            System.out.println("Enviar teste de " + this.vagaDesejada + " para " + this.nomeCanditado);
        } else {
            System.out.println("Enviar teste de " + this.vagaDesejada + " para " + this.nomeCanditado);
        }
    }

}
