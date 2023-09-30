package operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!!condicao2);
        System.out.println();

        System.out.println("\nTabela verdade E");
        System.out.print("V x V - ");
        System.out.println(true && true);
        System.out.print("V x F - ");
        System.out.println(true && false);
        System.out.print("F x V - ");
        System.out.println(false && true);
        System.out.print("F x F - ");
        System.out.println(false && false);

        System.out.println("\nTabela verdade OU");
        System.out.print("V x V - ");
        System.out.println(true || true);
        System.out.print("V x F - ");
        System.out.println(true || false);
        System.out.print("F x V - ");
        System.out.println(false || true);
        System.out.print("F x F - ");
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusiro - XOR");
        System.out.print("V x V - ");
        System.out.println(true ^ true);
        System.out.print("V x F - ");
        System.out.println(true ^ false);
        System.out.print("F x V - ");
        System.out.println(false ^ true);
        System.out.print("F x F - ");
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT");
        System.out.print("V - ");
        System.out.println(!true);
        System.out.print("F - ");
        System.out.println(!false);


    }
}
