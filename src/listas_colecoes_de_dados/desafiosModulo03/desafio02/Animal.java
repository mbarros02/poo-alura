package listas_colecoes_de_dados.desafiosModulo03.desafio02;

public class Animal {

    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Animal() {
    }

    public void emitirSom() {
        System.out.println("Au Au");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }
}
