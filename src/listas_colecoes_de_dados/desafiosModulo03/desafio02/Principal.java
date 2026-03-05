package listas_colecoes_de_dados.desafiosModulo03.desafio02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Cachorro doguinho = new Cachorro("Caramelo", 10);
        Cachorro rotvailer = new Cachorro("Bravo", 11);
        Gato cat = new Gato("Miau", 4);

        ArrayList<Animal> listaAnimal = new ArrayList<>();
        listaAnimal.add(doguinho);
        listaAnimal.add(rotvailer);
        listaAnimal.add(cat);

        for (Animal dog : listaAnimal) {
            System.out.println(dog.getNome());
            if (dog instanceof Animal animal) {
                dog.emitirSom();
            }
        }
    }
}
