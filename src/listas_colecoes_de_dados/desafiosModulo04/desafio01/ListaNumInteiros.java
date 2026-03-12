package listas_colecoes_de_dados.desafiosModulo04.desafio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumInteiros {
    public static void main(String[] args) {

        List<Integer> listaNumInt = new ArrayList<>();
        listaNumInt.add(10);
        listaNumInt.add(2);
        listaNumInt.add(35);
        listaNumInt.add(4);
        listaNumInt.add(52);
        listaNumInt.add(6);

        System.out.println("Lista sem ordenação: ");
        System.out.println(listaNumInt); // apeans imprimindo
        Collections.sort(listaNumInt); // ordenando a lista
        System.out.println("Lista ordenada: ");
        System.out.println(listaNumInt); //imprimindo a lista após ordenação

    }
}
