package exercicio7;

public class Estudante {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    
    
    double Media(){
        return nota1 + nota2 + nota3;
    }
    
    double pontosFaltando(){
        if(Media() < 60.0){
            return 60.0 - Media();
        }else {
            return Media();
        }
    }
}
