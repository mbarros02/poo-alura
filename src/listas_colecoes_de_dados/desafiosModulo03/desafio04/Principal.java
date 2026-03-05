package listas_colecoes_de_dados.desafiosModulo03.desafio04;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto p1 = new Produto("liquidificador", 250);
        Produto p2 = new Produto("batedeira", 180);
        Produto p3 = new Produto("panela", 150);
        Produto p4 = new Produto("prato", 100);
        Produto p5 = new Produto("talher", 50);
        Produto p6 = new Produto("xícara", 10);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);
        listaProdutos.add(p6);

        double total = 0;
        for (Produto pro : listaProdutos) {
                total += pro.getPreco();
        }
        System.out.println(total / 6);
    }
}
