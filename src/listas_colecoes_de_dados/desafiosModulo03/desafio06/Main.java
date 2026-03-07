package listas_colecoes_de_dados.desafiosModulo03.desafio06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        String entrada;

        do {
            System.out.println("Deseja criar uma conta: \n" + "1.Sim \n" + "2.Não");
            entrada = scan.next();

            if (entrada.equalsIgnoreCase("Não")) {
                break;
            }
                System.out.println("Nome da conta: ");
                String nome = scan.next();

                System.out.println("Saldo da conta: ");
                double saldo = scan.nextDouble();

                ContaBancaria c = new ContaBancaria(nome, saldo);
                listaContas.add(c);

        } while (entrada.equalsIgnoreCase("Sim"));
        System.out.println("--------- Sistema Encerrado -------");
        listaContas.sort(Comparator.comparing(ContaBancaria::getSaldo));
        System.out.println(listaContas);
    }
}
