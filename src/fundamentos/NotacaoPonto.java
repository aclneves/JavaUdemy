package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";

        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");

        System.out.println(s);

        String x = "leo".toUpperCase();
        System.out.println(x);
        System.out.println("Leo".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);

        //Tipos primitivos não tem o operador "."
    }
}
