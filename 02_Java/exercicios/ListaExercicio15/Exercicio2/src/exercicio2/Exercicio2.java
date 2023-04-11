package exercicio2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Exercicio2 {

    public static void main(String[] args) {
        
        String path ="C:\\Users\\Cesar Roberto\\Documents\\Backup\\MinhaCoisas\\Vnt_School\\02_Java\\exercicios\\ListaExercicio15\\mediaPreco.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPreco())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("O preco eh: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPreco() < avg)
                    .map(p -> p.getNome()).sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
