package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Equação: ax² + bx + c = 0");

        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("As raízes da equação são: ");
        System.out.printf("x1: %.2f", raiz1);
        System.out.printf("\nx2: %.2f", raiz2);

    }
}
