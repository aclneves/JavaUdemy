package controle.exercicios;

import java.util.Scanner;

/**
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
 * 10 e é par;
 */
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("Este número está entre 0 e 10 e é par!");
        }
            else {
                System.out.println("Este número está entre 0 e 10 e é ímpar!");
            }
        } else {
            System.out.println("Este número não está entre 0 e 10");
        }

        scanner.close();
    }
}
