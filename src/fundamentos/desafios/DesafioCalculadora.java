package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Ler uma operação + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro operando: ");
        double operando1 = entrada.nextDouble();
        System.out.println("Digite o segundo operando: ");
        double operando2 = entrada.nextDouble();
        System.out.println("Digite a operação desejada: ");
        String operacao = entrada.next();   

        double resultado = operacao.equals("+") ? operando1 + operando2 : 0;
        resultado = operacao.equals("-") ? operando1 - operando2 : resultado;
        resultado = operacao.equals("*") ? operando1 * operando2 : resultado;
        resultado = operacao.equals("/") ? operando1 / operando2 : resultado;
        resultado = operacao.equals("%") ? operando1 % operando2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f", operando1, operacao, operando2, resultado);


        entrada.close();

    }
}
