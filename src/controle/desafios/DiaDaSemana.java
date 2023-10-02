package controle.desafios;

import java.util.Scanner;

public class DiaDaSemana {
    // Vai ler um dia da semana e retornar o número correspondente conforme tabela abaixo, utilizando if - else - if:
    // Domingo -> 1
    // Segunda -> 2
    // Terça -> 3
    // Quarta -> 4
    // Quinta -> 5
    // Sexta -> 6
    // Sábado -> 7

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite o dia da semana desejado: ");
        String dia = scanner.nextLine();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
            System.out.println(7);
        } else {
            System.out.println("Você não digitou um dia correto!");
        }
    }
}
