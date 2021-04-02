package br.com.devinhouse.empresa.folhadepagamento;

public class FuncionarioPorPeca extends Funcionario {
	
	private int qtdPecas ;
	private double salarioPorPeca;
	
	public FuncionarioPorPeca(String nome, String sobreNome, int dia, int mes, int ano, int qtdPecas , double salarioPorPeca ) {
		super(nome, sobreNome, dia, mes, ano);
		this.qtdPecas  = qtdPecas ;
		this.salarioPorPeca = salarioPorPeca;
	}

	@Override
	public double calcularSalarioMensal() {
		double bonificacao = 0;
		if (super.bonificacaoAniversario()) {bonificacao = 100;}
		return this.qtdPecas * this.salarioPorPeca + bonificacao;
	}
	
	@Override
	public String toString() {
		return String.format("%sValor por peça: R$%.2f%n"
				+ "Quantidade de peças: %d%n"
				+ "Salário mensal: R$%.2f%n", 
				super.toString(), this.salarioPorPeca, this.qtdPecas, this.calcularSalarioMensal());
	}	

}
