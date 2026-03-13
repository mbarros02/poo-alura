package listas_colecoes_de_dados.zdesafioFinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Compras> listaCompras = new ArrayList<>();
        double valorCartao, valorCompra;
        String descricao;
        int comecar;

        System.out.println("------------- VAMOS COMEÇAR A COMPRA ------------");
        System.out.println("Digite o limite do seu cartão: ");
        valorCartao = scan.nextDouble();
        Cartao cartao = new Cartao(valorCartao);

        do {

        if(valorCartao < 0) {
            System.out.println("Cartão sem limite. Não poderemos iniciar a compra.");
            break;
        }
            System.out.println("Digite a descrição do produto: ");
            descricao = scan.next();
            System.out.println("Digite o valor do produto: ");
            valorCompra = scan.nextDouble();
            Compras compra = new Compras(descricao, valorCompra);
            cartao.setSaldo(cartao.getSaldo() - valorCompra);

            if (cartao.getSaldo() < 0) {
                System.out.println("***** Cartão Sem Limite *******");
                System.out.println("Compra encerrada!");
                break;
            }

            listaCompras.add(compra);

            System.out.println("01 - Fazer nova compra: \n" + "02 - Encerrar: ");
            comecar = scan.nextInt();

        } while (comecar == 1);

        System.out.println("--------- SUAS COMPRAS ---------");
        listaCompras.sort(Comparator.comparing(Compras::getValorCompra));
        System.out.println(listaCompras);
        System.out.println("---------------------------------");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
        scan.close();

    }
}

