package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto;

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = scanner.nextLine();
        } while (!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Parabéns, você é educado!");

        scanner.close();
    }
}
