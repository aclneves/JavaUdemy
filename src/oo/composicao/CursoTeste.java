package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("React");

        curso1.adcionarAluno(aluno1);
        curso1.adcionarAluno(aluno2);

        curso2.adcionarAluno(aluno1);
        curso2.adcionarAluno(aluno2);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Estou matriculado no curso " + curso1.nome + "...");
            System.out.println("... e meu nome é " + aluno.nome);
            System.out.println();
        }

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no curso " + curso3.nome + "...");
            System.out.println("... e meu nome é " + aluno.nome);
            System.out.println();
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");

        System.out.println(cursoEncontrado.nome);
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);
        }

        System.out.println(aluno1.cursos.get(0).alunos);


    }
}
