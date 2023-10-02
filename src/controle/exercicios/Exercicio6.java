package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        for (int i = 9; i >= 0; i--) {
            System.out.print("Digite o número: ");
            int tentativa = scanner.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!|\nBom jogo!");
                break;
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Você digitou um número maior, tente de novo!");
            } else {
                System.out.println("Você digitou um número menor, tente de novo");
            }
            if (i == 0) {
                System.out.println("Game Over");
            } else {
                System.out.println("Você ainda tem " + i + " tentivas");
            }
        }

        scanner.close();
    }
}
