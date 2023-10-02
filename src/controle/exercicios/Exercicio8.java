package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra desejada: ");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i) + " ");
        }

        scanner.close();
    }


}
