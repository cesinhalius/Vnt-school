package exercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 *
 */
public class Exercicio5 {

    public static void main(String[] args) {
        String caminho = "C:\\Users\\Cesar Roberto\\Documents\\Backup\\MinhaCoisas\\Vnt_School\\02_Java\\exercicios\\ListaExercicio13\\in.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

}
