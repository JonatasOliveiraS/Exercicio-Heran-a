package com.br.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteHeranca {

	public static void main(String[] args) {
		List<String> filmes = new ArrayList<>(Arrays.asList("Eu Sou a Lenda", "Homens de Preto", "À Procura da Felicidade","Eu Robô"));
		
		Ator ator = new Ator("Will", "Smith", 50 , filmes ,false ,1968 ,"À Procura da Felicidade");
		System.out.println(ator);
		
		List<String> linguagens = new ArrayList<>(Arrays.asList("Java","Python","JavaScript","C","C++"));
		
		Programador programador = new Programador("Jonatas", "Oliveira", 19, linguagens, 1, true);
		System.out.println(programador);
	}

}
