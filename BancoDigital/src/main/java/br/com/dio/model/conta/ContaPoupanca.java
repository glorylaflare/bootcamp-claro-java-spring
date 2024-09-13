package br.com.dio.model.conta;

import br.com.dio.model.cliente.Cliente;

public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS_PADRAO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public void renderJuros() {
        double juros = this.saldo * TAXA_JUROS_PADRAO;
        this.saldo += juros;
        System.out.printf("Juros de %.2f aplicados. Novo saldo: %.2f\n", juros, this.saldo);
    }
}
