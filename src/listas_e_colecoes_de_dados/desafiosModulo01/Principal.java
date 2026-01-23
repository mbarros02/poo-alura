package aula01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(23, "Marcello");
        Pessoa p2 = new Pessoa(23, "Marcello");
        Pessoa p3 = new Pessoa(23, "Marcello");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0).getNome());
        System.out.println(pessoas);

    }
}
