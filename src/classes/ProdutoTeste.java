package classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ProdutoTeste {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);


        Produto p1 = new Produto("Notebook", 5000);

        Produto p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 10;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.println("Valor final do " + p1.nome + ": " + nf.format(p1.calculaDesconto(0)));
        System.out.println("Valor final do " + p2.nome + ": " + nf.format(p2.calculaDesconto(0.1)));

    }
}
