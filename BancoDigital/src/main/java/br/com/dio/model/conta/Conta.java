package br.com.dio.model.conta;

import br.com.dio.exception.SaldoInsuficienteException;
import br.com.dio.model.cliente.Cliente;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    private final int VALOR_LIMITE_SAQUE = 25000;
    private final int VALOR_LIMITE_DEPOSITO = 10000;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        if(valor >= VALOR_LIMITE_SAQUE) {
            this.saldo -= valor - calculaTaxa(valor, 0.025);
        }
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        if(valor >= VALOR_LIMITE_DEPOSITO) {
            this.saldo += valor - calculaTaxa(valor, 0.035);
        }
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public double calculaTaxa(double valor, double juros) {
        return valor * juros;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
