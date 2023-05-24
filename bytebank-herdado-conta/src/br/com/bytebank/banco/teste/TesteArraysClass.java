package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorGenerico;

public class TesteArraysClass {

	public static void main(String[] args) {
		
		GuardadorDeContas guardadorConta = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 11);
		guardadorConta.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardadorConta.adiciona(cc2);
		
		int tamanho = guardadorConta.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardadorConta.getReferencia(0);
		System.out.println(ref.getNumero());
		
		
		
		GuardadorGenerico guardadorGenerico = new GuardadorGenerico();
		
		Conta ccGenerico = new ContaCorrente(11, 11);
		guardadorGenerico.adiciona(ccGenerico);
		
		Conta cc2Generico = new ContaCorrente(22, 22);
		guardadorGenerico.adiciona(cc2Generico);
		
		int tamanhoGenerico = guardadorGenerico.getQuantidadeDeElementos();
		System.out.println(tamanhoGenerico);
		
		Conta refGenerico = (Conta) guardadorGenerico.getReferencia(0);
		System.out.println(refGenerico.getNumero());
		
	}
	
}
