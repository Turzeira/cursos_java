package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println();
			System.out.println(linha);
			

			// Analisa a String(linha)
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();// utilizou o parse para alterar para int 
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble ();
			
			// essas formatações serve para string inteiro, varios tipos !
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s %04d %08d %20s: "
					+ "%08.1f", tipoConta,agencia,numero,titular,saldo);
			System.out.println(valorFormatado);

			linhaScanner.close();

//		String [] valores = linha.split(",");
//		System.out.println(Arrays.toString(valores));
//		dessa forma consegue extrair os valores corretamente de forma separada 

		}
		scanner.close();
	}

}
