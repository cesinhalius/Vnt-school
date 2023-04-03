package exercicio4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Nesta atividade leia atentamente o conteúdo que será apresentado nos próximos
 * slides. Este conteúdo aborda o processo de ler arquivos textos com as Classes
 * Files e Scanner.Após a leitura cuidadosa. Reproduza o código apresentado como
 * exemplo.Para fazer a leitura crie um arquivoqualquer de texto do tipo .txt
 *
 */
public class Exercicio4 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Cesar Roberto\\Documents\\Backup\\MinhaCoisas\\Vnt_School\\02_Java\\exercicios\\ListaExercicio13\\in.txt");
        Scanner sc = null;
        
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.next());
            }
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage()); 
        }finally{
            if(sc != null){
                sc.close();
            }
        }
    }

}
