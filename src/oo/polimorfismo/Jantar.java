package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(60.0);

        Arroz arroz = new Arroz(0.250);
        Feijao feijao = new Feijao(0.300);
        Sorvete sorvete = new Sorvete(0.400);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);
        convidado.comer(sorvete);

        System.out.println(convidado.getPeso());
    }
}
