package controle.desafios;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavra = "";

        while (!palavra.equalsIgnoreCase("sair")) {

            System.out.print("Digite a palavra desejada ou sair pra encerrar: ");
            palavra = scanner.nextLine();
            System.out.println("Você escreveu: " + palavra);
        }

        System.out.println("Programa encerrado");
        scanner.close();
    }
}
