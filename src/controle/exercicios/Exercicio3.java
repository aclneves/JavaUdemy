package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("Media: %.2f\nResultado: Aprovado", media);
        } else if (media >= 4) {
            System.out.printf("Media: %.2f\nResultado: Recuperação", media);
        } else {
            System.out.printf("Media: %.2f\nResultado: Reprovado", media);
        }


        scanner.close();

    }
}
