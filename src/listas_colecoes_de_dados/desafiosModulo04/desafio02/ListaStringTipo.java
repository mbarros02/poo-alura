package listas_colecoes_de_dados.desafiosModulo04.desafio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaStringTipo {
    public static void main(String[] args) {

        Titulo t1 = new Titulo("Codar");
        Titulo t2 = new Titulo("Aprender");
        Titulo t3 = new Titulo("Na Alura");
        Titulo t4 = new Titulo("Está Sendo");
        Titulo t5 = new Titulo("Legal");

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(t4);
        listaTitulos.add(t5);
        listaTitulos.add(t3);
        listaTitulos.add(t1);
        listaTitulos.add(t2);
        Collections.sort(listaTitulos);

        System.out.println("Lista ordenada: ");
        System.out.println(listaTitulos);

    }
}
