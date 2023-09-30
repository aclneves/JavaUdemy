package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.next();
        System.out.print("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("---- Resultado -----");
        System.out.println(nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.printf("IMC: %.2f" , imc);

        entrada.close();
    }
}
