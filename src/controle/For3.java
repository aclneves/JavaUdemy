package controle;

public class For3 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j != 9) {
                    System.out.printf("([i = %d] [j = %d]), ", i, j);
                } else {
                    System.out.printf("([i = %d] [j = %d]) ", i, j);
                }
            }
            System.out.println();
        }
    }
}
