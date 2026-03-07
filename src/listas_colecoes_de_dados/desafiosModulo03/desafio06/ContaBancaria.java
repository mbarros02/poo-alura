package listas_colecoes_de_dados.desafiosModulo03.desafio06;

public class ContaBancaria {

    private String conta;
    private double saldo;

    public ContaBancaria(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
