package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> vezesDois = numero -> numero * 2;
        UnaryOperator<Integer> aoQuadado = numero -> numero * numero;

        System.out.println(maisDois
                .andThen(vezesDois)
                .andThen(aoQuadado)
                .apply(5));

        System.out.println(aoQuadado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0));
    }
}
