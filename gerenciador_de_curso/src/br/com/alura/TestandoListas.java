package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhado com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(aula1);
		// aulas.remove(1);

		System.out.println(aulas+ "\n");

		// para string aula dentro de aulas
		for (String aula : aulas) {
//		ou for(int i = 0; i<aula.size(); i++)
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("\nA primeira aula é: " + primeiraAula);

		
		aulas.forEach(aula -> {System.out.println("\nPercorrendo: "+aula);
		System.out.println("Aula: " +aula);});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("\n"+aulas);
		
		System.out.println("\nFazendo um sort");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		
	}

}
