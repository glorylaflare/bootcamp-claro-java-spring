package br.com.dio.model.banco;

import br.com.dio.model.cliente.Cliente;
import br.com.dio.model.conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Banco implements IBanco {

    private String nome;
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<Integer, Conta> contas = new HashMap<>();;

    public Banco(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }
    @Override
    public Cliente buscarClientePorId(String id) {
        return clientes.get(id);
    }
    @Override
    public void removerCliente(String id) {
        clientes.remove(id);
    }
    @Override
    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }
    @Override
    public Conta buscarContaPorNumero(int numero) {
        return contas.get(numero);
    }
    @Override
    public void removerConta(int numero) {
        contas.remove(numero);
    }
    @Override
    public boolean autenticarCliente(String id, String senha) {
        Cliente cliente = clientes.get(id);
        if(cliente != null) {
            return cliente.getSenha().equals(senha);
        }
        return false;
    }
}
