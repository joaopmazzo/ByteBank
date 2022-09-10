package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 9113269592322744427L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
