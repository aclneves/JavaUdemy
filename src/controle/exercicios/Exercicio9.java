package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
}
