package br.com.devinhouse.empresa.folhadepagamento;

import br.com.devinhouse.empresa.utils.Utilitario;

public class FuncionarioHorista extends Funcionario {
	private double salarioHora;
	private int horaTrabalhada;
	
	public FuncionarioHorista(String nome, String sobreNome, double salarioHora, int horaTrabalhada, int dia, int mes, int ano) {
		super(nome, sobreNome, dia, mes, ano);
		this.salarioHora = Utilitario.validarValorPositivo(salarioHora);
		this.horaTrabalhada = (int) Utilitario.validarValorPositivo(horaTrabalhada);
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = Utilitario.validarValorPositivo(salarioHora);
	}

	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}

	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = (int) Utilitario.validarValorPositivo(horaTrabalhada);
	}

	@Override
	public double calcularSalarioMensal() {
		double bonificacao = 0;
		if (super.bonificacaoAniversario()) {bonificacao = 100;}
		return this.salarioHora * this.horaTrabalhada + bonificacao;
	}
	
	@Override
	public String toString() {
		return String.format("%sHoras trabalhadas: R$%d%n"
				+ "Valor da hora: R$%.2f%n"
				+ "Salário mês: R$%.2f%n", 
				super.toString(), this.horaTrabalhada, this.salarioHora, this.calcularSalarioMensal());
	}
}