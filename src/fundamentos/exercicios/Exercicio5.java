package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da base do triangulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite o valor da altura do triangulo ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f", area);

        entrada.close();


    }

}
