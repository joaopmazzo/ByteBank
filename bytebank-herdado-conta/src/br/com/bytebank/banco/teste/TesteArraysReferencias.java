package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArraysReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		Conta ref = contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}
	
}
