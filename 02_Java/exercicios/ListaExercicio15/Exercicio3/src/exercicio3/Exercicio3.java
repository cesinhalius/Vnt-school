package exercicio3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio3 {

    public static void main(String[] args) {
        
        String caminho = "C:\\Users\\Cesar Roberto\\Documents\\Backup\\MinhaCoisas\\Vnt_School\\02_Java\\exercicios\\ListaExercicio15\\salario.txt";
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Entra com seu salario: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(x -> x.getSalario() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email cujo salario eh maior que R$" + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getNome().charAt(0) == 'M')
                    .map(x -> x.getSalario())
                    .reduce(0.0, (x, y) -> x + y);
            
            double soma = list.stream()
                    .filter(x -> x.getNome().charAt(0) == 'A')
                    .map(x -> x.getSalario())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Soma dos salarios das pessoas com nomes iniciam com 'M': R$" + String.format("%.2f", sum));
            System.out.println("Soma dos salarios das pessoas com nomes iniciam com 'A': R$" + String.format("%.2f", soma));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
