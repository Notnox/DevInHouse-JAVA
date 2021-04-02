package br.com.devinhouse.empresa.folhadepagamento;

import br.com.devinhouse.empresa.utils.Utilitario;

public class FuncionarioAssalariado extends Funcionario {
	private double salario;
	
	public FuncionarioAssalariado(String nome, String sobreNome, double salario, int dia, int mes, int ano) {
		super(nome, sobreNome, dia, mes, ano);
		this.salario = Utilitario.validarValorPositivo(salario);
	}

	public void setSalario(double salario) {
		this.salario = Utilitario.validarValorPositivo(salario);
	}

	@Override
	public double calcularSalarioMensal() {
		double bonificacao = 0;
		if (super.bonificacaoAniversario()) {bonificacao = 100;}
		return this.salario + bonificacao;
	}
	
	@Override
	public String toString() {
		return String.format("%s%s: R$%.2f%n", super.toString(), "Salário mensal", this.calcularSalarioMensal());
	}
	
}