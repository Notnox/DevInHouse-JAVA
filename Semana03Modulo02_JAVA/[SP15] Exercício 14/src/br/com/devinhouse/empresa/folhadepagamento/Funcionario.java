package br.com.devinhouse.empresa.folhadepagamento;

import java.util.Calendar;

import br.com.devinhouse.empresa.utils.DataDeNascimento;

public abstract class Funcionario {
	private String nome;
	private String sobreNome;
	private DataDeNascimento aniversario;
	private static int totalDeFuncionarios;
	
	public Funcionario(String nome, String sobreNome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		aniversario = new DataDeNascimento(dia, mes, ano);
		totalDeFuncionarios++;
	}
	
	public static int getTotalDeFuncionarios() {
		return totalDeFuncionarios;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public boolean bonificacaoAniversario() {
		Calendar calendar = Calendar.getInstance();
		int mesAtual = calendar.get(Calendar.MONTH);
		
		if ((int) aniversario.getMes() == (int) mesAtual + 1) {return true;}
		return false;
	}
	
	public abstract double calcularSalarioMensal();
	
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%nAniversáriante?: %s%n", "Nome", this.nome, this.sobreNome, this.bonificacaoAniversario() ? "Parabéns!! ganho R$ 100 reais!" : "Ainda não ;( mas vai chegar!");
	}
}
