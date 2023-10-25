package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {

    Integer quantidade;
    Produto produto;

    public Item(Produto produto, Integer quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
