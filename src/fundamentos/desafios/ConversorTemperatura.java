package fundamentos.desafios;

public class ConversorTemperatura {

    public static void main(String[] args) {

        final double FATOR_CELSIUS = 5.0/9.0;
        final double FATOR_FAHRENHEIT = 9.0/5.0;
        final double AJUSTE = 32;
        double tempFahrenheit = 50.0;

        double tempCelsius = 30.0;

        double convertidaParaCelsius = 0d;
        double convertidaParaFahrenheit = 0d;

        convertidaParaCelsius = (tempFahrenheit - AJUSTE) * (FATOR_CELSIUS);
        convertidaParaFahrenheit = (tempCelsius * FATOR_FAHRENHEIT) + AJUSTE;

        System.out.println("A temperatura de 50 F° é igual a " + convertidaParaCelsius + "C°");
        System.out.println("A temperatura de 30 C° é igual a " + convertidaParaFahrenheit + "F°");
    }
}
