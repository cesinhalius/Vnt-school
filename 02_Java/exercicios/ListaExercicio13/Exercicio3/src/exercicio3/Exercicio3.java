package exercicio3;

/**
 *
 *
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        boolean falaAgressiva = false;
        double peso = 9;
        int idade = 6;
        String corDoPelo = "Branco";
        int dono = 0;
        int membros = 4;
        String horarioManha = "Manhã";
        String horarioTarde = "Tarde";
        String horarioNoite = "Noite";

        Cachorro c1 = new Cachorro();
        c1.setPeso(peso);
        c1.setIdade(idade);
        c1.setCorPelo(corDoPelo);
        c1.reagir(falaAgressiva);
        c1.reagir(horarioNoite);
        c1.reagir(c1.getIdade(), c1.getPeso());
        c1.reagir(dono);
        
        System.out.println("--------------------------------------------------");
        
        Lobo l1 = new Lobo();
        l1.emitirSom();
        l1.locomover();
        l1.alimentar();

        
    }
}


