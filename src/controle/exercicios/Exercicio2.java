package controle.exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        int anoAtual = cal.get(Calendar.YEAR);


        boolean bissexto = anoAtual % 4 == 0 && ((anoAtual % 100) != 0 || anoAtual % 400 == 0);

        if (bissexto) {
            System.out.printf("O ano %d é um ano bissexto", anoAtual);
        } else {
            System.out.printf("O ano %d não é um ano bissexto", anoAtual);
        }
    }
}
