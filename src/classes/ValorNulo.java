package classes;

import classes.desafios.Data;

public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        String s2 = null;
        // System.out.println(s2.concat("!!!!")); Não funciona pois dará NullPointer

        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null) {
            System.out.println(d1.obterDataFormatada());
        }

        String s3 = Math.random() > 0.5 ? "Opa!" : null;
        if (s3 != null) {
            System.out.println(s3.concat("!!!"));
        }

    }
}
