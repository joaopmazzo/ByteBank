package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(100d);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calcImposto = new CalculadorDeImposto();
		
		calcImposto.registra(cc);
		calcImposto.registra(seguro);
		
		System.out.println(calcImposto.getTotalImposto());
		
	}
	
}
