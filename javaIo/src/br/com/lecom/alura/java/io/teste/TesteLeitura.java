package br.com.lecom.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	private static final String filePath = "C:\\Users\\mazzo\\Development\\ByteBank\\javaIo\\files\\lorem.txt";
	
	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream(filePath);
			Reader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
			br.close();
		} catch (IOException e) {
			System.out.println("Falha ao ler arquivo :: "+e);
		}
	}

}