package listas_colecoes_de_dados.zdesafioFinal;

public class Compras{

    private String descricao;
    private double valorCompra;

    public Compras(String descricao, double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return descricao + "  " + valorCompra + "\n";
    }
}
