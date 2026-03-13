package listas_colecoes_de_dados.zdesafioFinal;

import java.util.List;

public class Cartao {

    private double limite;
    private double saldo;
    private List<Compras> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean LancaCompra(Compras compra) {
        if(this.saldo < compra.getValorCompra()) {
            this.saldo -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
