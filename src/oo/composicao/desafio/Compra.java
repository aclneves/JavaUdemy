package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

   final List<Item> itens = new ArrayList<>();

    void incluirItem(String nome, Double preco,  Integer quantidade) {
        this.itens.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
