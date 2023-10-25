package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<>();

    double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
