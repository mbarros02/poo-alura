package listas_colecoes_de_dados.desafiosModulo03.desafio01;

import java.util.ArrayList;

public class ListaStrings {
    public static void main(String[] args) {

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add("Primeiro nome");
        listaString.add("Segundo nome");
        listaString.add("Terceiro nome");

        for (String aqui : listaString) {
            System.out.println(aqui);
        }
    }
}
