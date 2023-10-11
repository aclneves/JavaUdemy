package classes.desafios;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

        Data d2 = new Data(22, 12, 1987);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }

}
