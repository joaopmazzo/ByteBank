package br.com.bytebank.banco.modelo;

public abstract interface Autenticavel {

	public abstract void setSenha(String senha);
	
	public abstract boolean autentica(String senha);

}
