package listas_colecoes_de_dados.desafiosModulo03.desafio05;

public class Quadrado implements Forma{

    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea() {
        this.area = getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Area Quarado: " + getArea() + "cm²";
    }
}
