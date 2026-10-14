package exerciciofixacao.entities;

public class Conta {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome, double depositoInicial) {

        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = depositoInicial;
    }

    public Conta(int numeroConta, String nome) {

        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public int numeroContaGet() {
        return numeroConta;
    }

    public double saldoGet() {
        return saldo;
    }

    public String nomeGet() {
        return nome;
    }

    public void setGet(String nome) {
        this.nome = nome;
    }

    public double deposito(double valor) {
        return saldo += valor;
    }

    public double saque(double valor) {
        return saldo -= valor + 5.0;
    }

    public String toString() {
        return "Numero da conta: " + numeroConta + " | Nome do cliente: " + nome + " | Saldo "
                + String.format("%.2f", saldo);
    }
}