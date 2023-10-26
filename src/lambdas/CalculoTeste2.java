package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (a, b) -> {
            return a + b;
        };
        System.out.println(soma.executar(2, 3));

        soma = (x, y) -> x * y;

        System.out.println(soma.executar(2, 3));
    }
}
