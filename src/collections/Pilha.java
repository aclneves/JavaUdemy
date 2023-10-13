package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println(livros);
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.size());
        System.out.println(livros.contains("O Pequeno Príncipe"));

        System.out.println(livros.pop()); // Lança exceção se estiver vazia
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // Retorna null se estiver vazio

        System.out.println(livros.isEmpty());

    }
}
