package classes.desafioModulo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("'João", 70.0);
        Pessoa maria = new Pessoa("'Maria", 60.0);

        Comida arroz = new Comida("Arroz", 0.3);
        Comida feijao = new Comida("Feijão", 0.4);

        System.out.println(joao.apresentar());
        System.out.println(maria.apresentar());

        joao.comer(arroz);
        joao.comer(feijao);

        System.out.println(joao.apresentar());


        maria.comer(arroz);
        maria.comer(feijao);

        System.out.println(maria.apresentar());
    }
}
