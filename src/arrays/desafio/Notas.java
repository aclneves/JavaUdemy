package arrays.desafio;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Quantas notas você quer inserir? ");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite o valor da nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média do aluno é igual a: " + media);

        entrada.close();
    }
}
