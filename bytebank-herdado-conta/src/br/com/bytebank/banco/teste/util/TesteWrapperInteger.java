package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = 22; // autoboxing
		int primitivoIdadeRef = new Integer(22); // unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivoIdadeRef); // ocorre autoboxing para Integer para se encaixar na List<Integer>
		
		int i1 = lista.get(0); // ocorre o unboxing para o tipo primitivo
		Integer i2 = lista.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		
		Integer valorRef = Integer.valueOf(33); // delegando a criação para método valueOf
		int valorPrimitivo = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper
		System.out.println(valorPrimitivo);
		
		
		Integer integerParseado = Integer.valueOf("20");
		int intParseado = Integer.valueOf("19");
		System.out.println(integerParseado);
		System.out.println(intParseado);
		
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	}
	
}
