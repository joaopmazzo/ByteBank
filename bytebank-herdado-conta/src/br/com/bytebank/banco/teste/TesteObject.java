package br.com.bytebank.banco.teste;

public class TesteObject {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
//		int[] idades = {29, 39, 49, 59, 69};
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade4 = idades[3];
		
		System.out.println(idade4);
		System.out.println(idades.length);
		
	}

}
