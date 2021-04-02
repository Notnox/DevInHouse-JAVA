package br.com.devinhouse.empresa.folhadepagamento;

import br.com.devinhouse.empresa.utils.Utilitario;

public class FuncionarioComissionado extends Funcionario {
	private double percentualDaComissao;
	private double valorTotalVendido;
	
	public FuncionarioComissionado(String nome, String sobreNome, double percentualDaComissao, double valorTotalVendido, int dia, int mes, int ano) {
		super(nome, sobreNome, dia, mes, ano);
		this.percentualDaComissao = Utilitario.validarPercentual(percentualDaComissao);
		this.valorTotalVendido = Utilitario.validarValorPositivo(valorTotalVendido);
	}
	
	public double getPercentualDaComissao() {
		return percentualDaComissao;
	}

	public void setPercentualDaComissao(double percentualDaComissao) {
		this.percentualDaComissao = Utilitario.validarPercentual(percentualDaComissao);
	}

	public double getValorTotalVendido() {
		return valorTotalVendido;
	}

	public void setValorTotalVendido(double valorTotalVendido) {
		this.valorTotalVendido = Utilitario.validarValorPositivo(valorTotalVendido);
	}

	@Override
	public double calcularSalarioMensal() {
		double bonificacao = 0;
		if (super.bonificacaoAniversario()) {bonificacao = 100;}
		return this.percentualDaComissao * this.valorTotalVendido + bonificacao;
	}
	
	@Override
	public String toString() {
		return String.format("%sValor vendido no mês: R$%.2f%n"
				+ "Percentual da comissão: R$%.2f%n"
				+ "Salário mensal: R$%.2f%n", 
				super.toString(), this.valorTotalVendido, this.percentualDaComissao, this.calcularSalarioMensal());
	}
}