package desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1 = entrada.nextLine().replace(",", ".");
        System.out.print("Digite o segundo salário: ");
        String salario2 = entrada.nextLine().replace(",", ".");;
        System.out.print("Digite o terceiro salário: ");
        String salario3 = entrada.nextLine().replace(",", ".");;

        double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;
        System.out.println("A media dos salários é: " + media);

        entrada.close();
    }
}
