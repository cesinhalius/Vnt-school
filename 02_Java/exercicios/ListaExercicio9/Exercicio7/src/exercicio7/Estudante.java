package exercicio7;

public class Estudante {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    
    
    double Media(){
        return ((nota1 * 30) + (nota2 * 35) + (nota3 * 35)/10);
    }
    
    double pontosFaltando(){
        if(Media() < 60){
            return 60 - Media();
        }else {
            return 0;
        }
    }
}
