package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 22);
		Conta cc2 = new ContaCorrente(22, 22);

		lista.add(cc1);
		
		boolean existe = lista.contains(cc2);
				
		System.out.println("Já existe? "+existe);
        
        for (Conta conta : lista) {
        	System.out.println(conta);
        }
		
	}
	
}
