package br.com.dio;

import br.com.dio.model.banco.Banco;
import br.com.dio.model.cliente.Cliente;
import br.com.dio.model.conta.Conta;
import br.com.dio.model.conta.ContaCorrente;
import br.com.dio.model.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente clienteMarcelo = new Cliente(
                "Marcelo",
                "Rua 1",
                "(21)98932-3245",
                "marcelo@email.com",
                "123");

        Banco banco = new Banco("Banco do Brasil");
        banco.adicionarCliente(clienteMarcelo);
        System.out.println(banco.autenticarCliente(clienteMarcelo.getId(), clienteMarcelo.getSenha()) ? "Autenticado!" : "Não autenticado!");

        ContaCorrente cc = new ContaCorrente(clienteMarcelo);
        ContaPoupanca cp = new ContaPoupanca(clienteMarcelo);

        banco.adicionarConta(cc);
        clienteMarcelo.adicionarConta(cc);
        clienteMarcelo.adicionarConta(cp);
        System.out.println(clienteMarcelo.listarContas());

        cc.depositar(2000);
        cc.transferir(1000, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.renderJuros();
    }
}