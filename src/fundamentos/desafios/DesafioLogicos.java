package fundamentos.desafios;

import java.util.Scanner;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça(V ou F)
        // Trabalho na quinta(V ou F)

        boolean trabalhouTerca = false;
        boolean trabalhouQuinta = false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Trabalho na terça?(S ou N): ");
        String terca = entrada.nextLine();
        if (terca.equalsIgnoreCase("S"))
            trabalhouTerca = true;

        System.out.println("Trabalho na terça?(S ou N): ");
        String quinta = entrada.nextLine();
        if (quinta.equalsIgnoreCase("S"))
            trabalhouQuinta = true;

        boolean comprouTV50 = trabalhouQuinta && trabalhouTerca;
        boolean comprouTV32 = trabalhouQuinta ^ trabalhouTerca;
        boolean comprouSorvete = trabalhouQuinta || trabalhouTerca;

        if (comprouTV50)
            System.out.println("Comprei TV de 50 polegadas");
        else if (comprouTV32)
            System.out.println("Comprei TV de 32 polegadas");
        else
            System.out.println("Não compramos TV =(");

        if(comprouSorvete)
            System.out.println("Tomamos sorvete!");
        else
            System.out.println("Não tomamos sorvete =(");

        entrada.close();
    }
}
