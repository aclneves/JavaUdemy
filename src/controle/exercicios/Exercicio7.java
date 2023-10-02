package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int total = 0;
        do {
            System.out.print("Digito um número positivo para a soma ou um negativo para sair: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                total += numero;
                System.out.println("O total da soma dos números inserios é igual a " + total);
            }
        } while (numero >= 0);

        scanner.close();
    }
}
