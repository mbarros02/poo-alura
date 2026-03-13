package listas_colecoes_de_dados.desafiosModulo04.desafio04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAndLinkedList {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Teste");
        lista.add("Testado");
        System.out.println(lista);

        lista = new LinkedList<>();
        lista.add("Tal coisa");
        lista.add("Tal coisa");
        System.out.println(lista);

    }
}
