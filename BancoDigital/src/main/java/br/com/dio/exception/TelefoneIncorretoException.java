package br.com.dio.exception;

public class TelefoneIncorretoException extends RuntimeException {
    public TelefoneIncorretoException(String mensagem) {
        super(mensagem);
    }
}
