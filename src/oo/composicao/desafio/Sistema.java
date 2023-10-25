package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João das Couves");

        Compra compra1 = new Compra();
        compra1.incluirItem("Caneta", 5.0, 10);
        compra1.incluirItem("Caderno", 10.0, 10);

        Compra compra2 = new Compra();
        compra1.incluirItem("Lapis", 5.0, 10);
        compra1.incluirItem("Lapiseira", 10.0, 10);

        cliente.vincularCompra(compra1);
        cliente.vincularCompra(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
