package br.com.bytebank.banco.modelo;

public class SistemaInterno {
	
	private String senha = "Pmazzo01";

	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não Pode entrar no sistema");
		}
	}
	
}
