package com.br.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Programador extends pessoa {
	private List <String> linguagensUsadas = new ArrayList<String>();
	private int anosExperiencia;
	private boolean gostaCafe;

	public Programador(String nome, String sobreNome, int idade, List<String> linguagensUsadas, int anosExperciencia,
			boolean gostaCafe) {
		super(nome, sobreNome, idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperciencia;
		this.gostaCafe = gostaCafe;
	}

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperciencia() {
		return anosExperiencia;
	}

	public void setAnosExperciencia(int anosExperciencia) {
		this.anosExperiencia = anosExperciencia;
	}

	public boolean isGostaCafe() {
		return gostaCafe;
	}

	public void setGostaCafe(boolean gostaCafe) {
		this.gostaCafe = gostaCafe;
	}
	public String toString () {
		String programador = "";
		programador += "Nome do Programador -> " + super.getNome() +"\n";
		programador += "SobreNome -> " + super.getSobreNome() + "\n";
		programador += "Idade -> " + super.getIdade() + "\n";
		programador += "Linguagens Usadas -> " + this.getLinguagensUsadas() + "\n";
		programador += "Anos de experiência -> " + this.getAnosExperciencia() + "\n";
		programador += "Gosta de Café ? -> " + this.gostaCafe + "\n";
		
		return programador;
	}
	
}
