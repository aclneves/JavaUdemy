package collections;

import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {

        java.util.Queue<String> fila = new LinkedList<>();

        // Add e Offer adicionam a fila, o que muda é o comportamento com a fila cheia
        fila.add("Ana"); // Lança exceção
        fila.offer("Bia"); // retorna false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Guilherme");

        // Peek e Element a diferença do comportamento ocorre quando a fila está vazia
        System.out.println(fila);
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // Lança exceção

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());

        System.out.println(fila.poll()); // fila vazia, retorna null
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // fila vazia, lança exceção
        System.out.println(fila);

        fila.clear();
        System.out.println(fila);




    }

}
