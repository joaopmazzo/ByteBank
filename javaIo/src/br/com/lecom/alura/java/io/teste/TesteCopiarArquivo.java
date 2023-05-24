package br.com.lecom.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
	
	private static final String fileToCopy = "C:\\Users\\mazzo\\Development\\ByteBank\\javaIo\\files\\escritaTeste.txt";
	private static final String fileToWrite = "C:\\Users\\mazzo\\Development\\ByteBank\\javaIo\\files\\arquivoCopiado.txt";
	
	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream(fileToCopy);
			Reader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream fos = new FileOutputStream(fileToWrite);
			Writer ows = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(ows);
			
			String linhaLer;
			while ((linhaLer = br.readLine()) != null) {
				bw.write(linhaLer);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("Falha ao copiar arquivo :: "+e);
		}
	}

}
