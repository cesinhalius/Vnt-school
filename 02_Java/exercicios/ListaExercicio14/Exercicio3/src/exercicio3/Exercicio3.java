package exercicio3;

import java.io.*;
import java.util.*;

/**
 * Na contagem de votos de uma eleição, são gerados vários registros de votação
 * contendo o nome do candidato e a quantidadede votos (formato .csv) que ele
 * obteve em uma urna de votação. Você deve fazer um programa para ler os
 * registrosde votação a partir de um arquivo, e daí gerar um
 * relatórioconsolidado com os totais de cada candidato.
 *
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Map<String, Integer> candidatosVotos = new HashMap<>();
        String path = "C:\\Users\\Cesar Roberto\\Documents\\Backup\\MinhaCoisas\\Vnt_School\\02_Java\\exercicios\\ListaExercicio14\\Votos.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                String name = line.substring(0, line.indexOf(","));
                int votos = Integer.parseInt(line.substring(line.lastIndexOf(",") + 1));

                if (candidatosVotos.get(name) != null) {
                    candidatosVotos.put(name,candidatosVotos.get(name)+votos);
                } else {
                    candidatosVotos.put(name, votos);
                }
                line = br.readLine();
            }

            System.out.println(candidatosVotos);

        } catch (IOException e) {
            System.out.println("Error eh:" + e.getMessage());
        }
    }

}
