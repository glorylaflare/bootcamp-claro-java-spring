package br.com.dio.model.cliente;

import br.com.dio.exception.EmailInvalidoException;
import br.com.dio.exception.TelefoneIncorretoException;
import br.com.dio.model.conta.Conta;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
public class Cliente implements IClient{

    private String id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;

    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String endereco, String telefone, String email, String senha) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void atualizaEndereco(String enderecoAtualizado) {
        this.endereco = enderecoAtualizado;
    }
    @Override
    public void atualizaTelefone(String telefoneAtualizado) {
        if(telefoneAtualizado.length() < 14) {
            throw new TelefoneIncorretoException("O número de telefone, deve conter no mínimo 12 caracteres, exemplo: (00)00000-0000");
        }
        this.telefone = telefoneAtualizado;
    }
    @Override
    public void atualizaEmail(String emailAtualizado) {
        if(emailEValido(emailAtualizado)) {
            this.email = emailAtualizado;
        } else {
            throw new EmailInvalidoException("Email inválido");
        }
    }
    @Override
    public boolean emailEValido(String emailAtualizado) {
        return email.contains("@");
    }

    @Override
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    @Override
    public List<Conta> listarContas() {
        return Collections.unmodifiableList(contas);
    }

}
