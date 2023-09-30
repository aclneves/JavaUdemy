package fundamentos;

public class PrimitivoVersusObjeto {
    public static void main(String[] args) {
        String s = "texto";
        s = s.toUpperCase();

        int a = 123;
        // a. - Timo primitivo não carrega método

        // Wrappers
        Integer b = 123;
        System.out.println(b.compareTo(100));


    }


}
