package exercicio3;

public class Cachorro extends Mamifero {

    @Override
    void emitirSom() {
        System.out.println("au au au");
    }

    public void enterrarOsso() {

    }

    public void abanarRabo() {
        System.out.println("Abanar");
    }

    public void reagir(boolean falarFraseAgressiva) {
        if (!falarFraseAgressiva) {
            abanarRabo();
            emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, double peso) {
        if (getIdade() < 5 && getPeso() < 10) {
            System.out.print("Novo e leve: ");
            abanarRabo();
        } else if (getIdade() > 5 && getPeso() > 10) {
            System.out.println("Velho e pesado: Ignorar");
        } else if (getIdade() > 5 && getPeso() < 10) {
            System.out.println("Velho e leve: Rosnar");
        } else {
            System.out.println("Novo e pesado: ");
            emitirSom();
        }
    }

    public void reagir(int dono) {
        switch (dono) {
            case 0:
                System.out.print("Nao eh o dono: Rosnar ");
                emitirSom();
                break;
            case 1:
                System.out.print("Eh dono: ");
                abanarRabo();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
    
        public void reagir(String horarioDigitado) {
        switch (horarioDigitado) {
            case "Manha":
                System.out.print("Manha: ");
                abanarRabo();
                break;
            case "Tarde":
                System.out.print("Tarde: ");
                abanarRabo();
                emitirSom();
                break;
            case "Noite":
                System.out.println("Noite: Ignorar");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

}
