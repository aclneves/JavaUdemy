package fundamentos.desafios;

import static java.lang.Math.*;

public class DesafioAritimeticos {
    public static void main(String[] args) {

        double numA =pow(6 * (3 + 2), 2);
        double denA = 3 * 2;
        double superiorA = numA / denA;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;
        double superiorB = pow((numB / denB), 2);

        double numerador = pow((superiorA - superiorB), 3);

        double denominador = pow(10, 3);

        double reultado = numerador / denominador;

        System.out.println("O resultado é: " + reultado);

    }
}
