package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura desejada em Fº: ");
        double temperaturaF = entrada.nextDouble();

        double temperaturaC = (temperaturaF - 32) / 1.8;

        System.out.printf("A temperatura convertida de %.2fFº é de %.2fCº", temperaturaF, temperaturaC);

        entrada.close();
    }
}
