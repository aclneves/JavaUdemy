public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        a = 12; // apesar de ser inteiro, ele vai aceitar e transformar em double
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);
        c = "outro texto";
        System.out.println(c);

        //c = 4.5; não aceita pois só aceita o tipo inferido

        double d;
        d = 123.45; // é necessário inicializar a variável
        System.out.println(d);
    }

}
