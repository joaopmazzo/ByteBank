package br.com.lecom.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	private static final String filePath = "C:\\Users\\mazzo\\Development\\ByteBank\\javaIo\\files\\escritaTeste.txt";

	public static void main(String[] args) {
		
		try {
			OutputStream fos = new FileOutputStream(filePath);
			Writer osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.append("Hello");
			bw.newLine();
			bw.append("This is a test of writing a file");
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Falha ao escrever arquivo :: "+e);
		}
	}
	
}
