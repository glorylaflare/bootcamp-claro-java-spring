package org.example;

public class Conta {
    private String nomeCliente;
    private String numeroDaAgencia;
    private int numeroDaConta;
    private double saldo;

    public Conta(String nomeCliente, String numeroDaAgencia, int numeroDaConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String numero = Integer.toString(numeroDaConta);
        numero = numero.substring(0,numero.length()-1) + "-" + numero.substring(numero.length()-1);

        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, numero, numeroDaAgencia, saldo);
    }
}
