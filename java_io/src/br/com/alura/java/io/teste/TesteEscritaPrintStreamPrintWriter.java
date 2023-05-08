package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de Escrita/Saida com arquivo
//		OutputStream file = new FileOutputStream("Java_2.txt");
//		Writer transformador = new OutputStreamWriter(file); // transforamando byte em caracter
//		BufferedWriter bw = new BufferedWriter(transformador); // Tranformar os caracter em uma linha

		
		PrintStream ps = new PrintStream("Java_5.txt");
		
		ps.println("Aprendendo a biblioteca java.io");
		ps.println();
		ps.println("Utilizando a class Print Stream");
		
		ps.close();

	}

}
