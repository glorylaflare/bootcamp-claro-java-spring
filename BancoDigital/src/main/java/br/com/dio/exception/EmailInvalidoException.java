package br.com.dio.exception;

public class EmailInvalidoException extends IllegalArgumentException {
    public EmailInvalidoException(String mensagem) {
        super(mensagem);
    }
}
