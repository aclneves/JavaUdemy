package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalDivisores = 0;

        System.out.print("Digite o número desejado: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                totalDivisores++;
            }
        }

        switch (totalDivisores) {
            case 0:
                System.out.println("O número " + numero + " é um número primo");
                break;
            default:
                System.out.println("O número " + numero + " não é um número primo");
        }
    }
}
