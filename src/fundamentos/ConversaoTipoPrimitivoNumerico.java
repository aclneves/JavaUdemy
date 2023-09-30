package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // conversão implícita
        System.out.println(a);

        float b = (float) 1.0; // pode colocar a letra F ou um casting(conversão explícita)
        System.out.println(b);
        double d = 1.578673672367832224843748;
        System.out.println(d);
        float c = (float) 1.578673672367832224843748; // será truncado o valor
        System.out.println(c);

        int x = 4;
        byte y = (byte) x;
        System.out.println(y);
        int i = 340;
        byte j = (byte) i;
        System.out.println(j); // está fora do range

        double e = 1.94;
        int f = (int) e;
        System.out.println(f); // é truncado, não arredondado

    }
}
