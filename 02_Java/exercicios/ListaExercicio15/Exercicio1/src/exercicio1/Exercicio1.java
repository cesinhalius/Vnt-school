package exercicio1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Cesar Roberto
 */
public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7, 14, 16);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));
        
        int somar = list.stream().reduce(0, (a,b)-> a + b);
        System.out.println("Somar = " + somar);
        
        List<Integer> novaLista;
        novaLista = list.stream().filter(x -> x % 2==0).map(x-> x*20).collect(Collectors.toList());
        
        System.out.println(Arrays.toString(novaLista.toArray()));

    }

}
