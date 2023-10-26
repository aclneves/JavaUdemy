package lambdas;

import org.w3c.dom.ls.LSOutput;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicacao();

        System.out.println(soma.executar(2, 3));
        System.out.println(multiplicacao.executar(2, 3));

        System.out.println(soma.legal());
        System.out.println(Calculo.muitoLegal());

    }


}
