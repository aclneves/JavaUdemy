package controle.desafios;

import java.util.Scanner;

public class DesafioMedia {
    // Criar um programa que calcule a média das notas digitadas
    // Pode ser qualque quantidade de notas, o programa parará de ler notas quando o usuário digitar a nota -1
    // As notas também devem ser válidas, ou seja entre 0 e 10
    // No final do programa devem ser apresentadas a quantidade de notas e a média

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeNotas = 0;
        double totalNotas = 0;
        double nota = 0;


        while (nota != -1) {
            System.out.print("Por favor digite a nota (ou -1 para sair): ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                System.out.println("Fim da leitura de notas.");
            } else if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            } else {
                quantidadeNotas++;
                totalNotas += nota;
            }
        }

        double media = totalNotas / quantidadeNotas;
        System.out.println("Quandidade de notas: " + quantidadeNotas);
        System.out.println("Média das notas: " + media);

        scanner.close();
    }
}
