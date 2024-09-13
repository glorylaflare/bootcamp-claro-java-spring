package br.com.dio.model.conta;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    double calculaTaxa(double valor, double juros);
    void imprimirExtrato();
}
