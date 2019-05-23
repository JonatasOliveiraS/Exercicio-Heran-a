package com.br.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Ator extends pessoa {
		
	private List<String> filmesParticipados = new ArrayList<String>();
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;
		
	public Ator(String nome, String sobreNome, int idade, List<String> filmesParticipados, boolean temOscar,
			int anoNascimento, String melhorFilme) {
		super(nome, sobreNome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
		this.melhorFilme = melhorFilme;
	}

	public List<String> getFilmesParticipados() {
			return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
			this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
			return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
			this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
			return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
			return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
			this.melhorFilme = melhorFilme;
	}
		
	public String toString () {
		
		String ator = "";
		ator += "nome do Ator -> " + super.getNome() + "\n";
		ator += "sobreNome do ator -> " + super.getSobreNome() + "\n";
		ator += "idade do ator -> " + super.getIdade() + "\n";
		ator += "Filmes Participados -> " + this.getFilmesParticipados() + "\n";
		ator += "Tem Oscar ? -> " + this.temOscar + "\n";
		ator += "Ano de Nascimento -> " + this.getAnoNascimento() + "\n";
		ator += "Melhor filme -> " + this.getMelhorFilme() + "\n";
		
		return ator;
		
		}
}
