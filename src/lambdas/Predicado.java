package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto notebook = new Produto("Notebook", 4000, 0.15);
        Produto caderno = new Produto("Caderno", 300, 0.005);
        System.out.println(isCaro.test(notebook));
        System.out.println(isCaro.test(caderno));
    }
}
