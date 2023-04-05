package exercicio1;

import java.io.*;
import java.util.*;

/**
 * Um site de internet registra um log de acessosdos usuários. Um registro de
 * log consiste nonome de usuário (apenas uma palavra) e o instante em que o
 * usuário acessou o site no padrão ISO 8601, separados por espaço, conforme
 * exemplo. Fazer um programa que leia o log de acessosa partir de um arquivo, e
 * daí informe quantos usuáriosdistintos acessaram o site.
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Cesar Roberto\\Documents\\log.txt";
        Set<String> user = new TreeSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                user.add(line.substring(0, line.indexOf(" ")));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Total de pessoas que logaram eh " + user);
    }

}
