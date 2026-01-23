package listas_e_colecoes_de_dados.desafiosModulo02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Liquidificador", 10, 10);
        Produto p2 = new Produto("AirFrire", 10, 10);
        Produto p3 = new Produto("Panela", 10, 10);
        ProdutoPerecivel pr = new ProdutoPerecivel("Cola", 15, 15, "10/01/2025");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);


        System.out.println(pr);
        /*System.out.println(produtos);
        System.out.println("Quantidade de produtos na lista: " + produtos.size());
        System.out.println("Pesquisando o produto da posição 2: " + produtos.get(2));*/

        Collections.sort();

    }
}
