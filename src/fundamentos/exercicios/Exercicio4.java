package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        double numero = entrada.nextDouble();
        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("O quadrado de %.2f é %.2f", numero, quadrado);;
        System.out.println();
        System.out.printf("O cubo de %.2f é %.2f", numero, cubo);

        entrada.close();
    }
}
