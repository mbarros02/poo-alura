package listas_colecoes_de_dados.desafiosModulo03.desafio05;

public class Circulo implements Forma{

    private double raio;
    private double pi = 3.14;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea() {
        double exp = 2.00;
        this.area = pi * Math.pow(getRaio(), exp);
    }

    @Override
    public String toString() {
        return "Area do Circulo: " + area + "cm²";
    }
}
