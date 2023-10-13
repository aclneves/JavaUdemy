package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        java.util.List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Maria"));

        System.out.println(usuarios.get(2));

        usuarios.remove(1);
        usuarios.remove(new Usuario("Maria"));
        System.out.println("Tem?" + usuarios.contains(new Usuario("Ana")));

        for (Usuario u : usuarios) {
            System.out.println(u.nome);
        }

        System.out.println(usuarios.size());
    }
}
