package atividade1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * Crie um programa que instancie doisobjetos do tipo Set, veja o exemplo
 * abaixo. Em seguida faça as operações UNIÃO, INTERSEÇÃO e DIFERENÇA entre
 * esses conjuntos. Imprima o resultado.
 */
public class Atividade1 {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // uniao
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //INTERSEÇÃO
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //DIFERENÇA
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }

}
