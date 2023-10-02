package controle.desafios;

public class DesafioFor {
    public static void main(String[] args) {

        String texto = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(texto);
            texto += "#";
        }

        // Desafio é rescrever o código acima para que não use estrutura de controle numérica

        for (String valor = "#"; !valor.equals("######"); valor += "#") {
            System.out.println(valor);
        }
    }


}
