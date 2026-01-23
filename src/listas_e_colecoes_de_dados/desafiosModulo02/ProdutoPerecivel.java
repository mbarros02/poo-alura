package listas_e_colecoes_de_dados.desafiosModulo02;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, float preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "dataValidade= " + dataValidade + '\'' +
                '}';
    }
}
