package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetComportado {
    public static void main(String[] args) {

        // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();  // Set com ordenação

        listaAprovados.add("Ana");
        listaAprovados.add("Pedro");
        listaAprovados.add("Carlos");
        listaAprovados.add("Maria");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
