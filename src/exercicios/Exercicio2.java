package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura desejada em Cº: ");
        double temperaturaC = entrada.nextDouble();

        double temperaturaF = 1.8 * temperaturaC + 32;

        System.out.printf("A temperatura convertida de %.2fCº é de %.2fFº", temperaturaC, temperaturaF);

        entrada.close();
    }
}
