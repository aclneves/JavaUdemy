package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto caneta = new Produto("Caneta", 12.90, 0.10);
        Produto lapiseira = new Produto("Lapiseira", 15.90, 0.10);
        Produto notebook = new Produto("Notebook", 4900.00, 0.10);
        Produto caderno = new Produto("Caderno", 9.90, 0.10);
        Produto mouse = new Produto("Mouse", 29.90, 0.10);
        imprimir.accept(caneta);

        List<Produto> produtos = Arrays.asList(caneta, lapiseira, notebook, caderno, mouse);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);


    }
}
