package br.com.dio.model.cliente;

import br.com.dio.model.conta.Conta;

import java.util.List;

public interface IClient {

    void atualizaEndereco(String dadoAtualizado);
    void atualizaTelefone(String dadoAtualizado);
    void atualizaEmail(String dadoAtualizado);
    boolean emailEValido(String dadoAtualizado);
    void adicionarConta(Conta conta);
    List<Conta> listarContas();
}
