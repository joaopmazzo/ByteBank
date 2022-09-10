package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistema {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha("Pmazzo01");
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
	}

}
