package listas_colecoes_de_dados.desafiosModulo03.desafio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        double num;
        int escolha;

        do {
            System.out.printf("Escolha uma das opções: \n" + "1. Circulo \n" + "2. Quadrado \n" + "3. Encerrar");
            escolha = scan.nextInt();

            if(escolha == 3) { break; }

            System.out.println("Digite o valor para calcular a area da forma: ");
            num = scan.nextDouble();

            if (escolha == 1) {
                Forma c = new Circulo(num);
                c.calcularArea();
                listaDeFormas.add(c);
            } else if (escolha == 2){
                Forma c = new Quadrado(num);
                c.calcularArea();
                listaDeFormas.add(c);
            }

        } while (escolha == 1 || escolha == 2);
        System.out.println("------- Sitema encerrado! -------");
        System.out.println(listaDeFormas);
        scan.close();
    }
}

