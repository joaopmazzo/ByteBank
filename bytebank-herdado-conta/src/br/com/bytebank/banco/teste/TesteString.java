package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "João";

		String nomeReplace = nome.replace("M", "m");
		System.out.println(nomeReplace);

		String nomeLowerPlace = nome.toLowerCase();
		System.out.println(nomeLowerPlace);

		char nomeCharAt = nome.charAt(2);
		System.out.println(nomeCharAt);

		int nomeIndexOf = nome.indexOf("i");
		System.out.println(nomeIndexOf);

		String nomeSubstring = nome.substring(1);
		System.out.println(nomeSubstring);

		boolean nomeIsEmpty = nome.isEmpty();
		System.out.println(nomeIsEmpty);

		String nomeComEspaco = "	João	";
		String nomeTrim = nomeComEspaco.trim();
		System.out.println(nomeTrim);

		boolean nomeContains = nome.contains("ã");
		System.out.println(nomeContains);

		String[] nomeSplit = nome.split("ã");
		System.out.println(nomeSplit[0]+" "+nomeSplit[1]);

	}

}
