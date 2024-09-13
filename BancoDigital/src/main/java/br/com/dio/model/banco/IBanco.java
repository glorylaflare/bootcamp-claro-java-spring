package br.com.dio.model.banco;

import br.com.dio.model.cliente.Cliente;
import br.com.dio.model.conta.Conta;

public interface IBanco {

    void adicionarCliente(Cliente cliente);
    Cliente buscarClientePorId(String id);
    void removerCliente(String id);
    void adicionarConta(Conta conta);
    Conta buscarContaPorNumero(int numero);
    void removerConta(int numero);
    boolean autenticarCliente(String id, String senha);
}
