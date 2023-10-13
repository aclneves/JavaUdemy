package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
            for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
                System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, aluno + 1);
                notasDaTurma[aluno][nota] = entrada.nextDouble();
                total += notasDaTurma[aluno][nota];
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da tumra é " + media);
        System.out.println(Arrays.toString(notasDaTurma));
        for (double [] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();

    }
}
