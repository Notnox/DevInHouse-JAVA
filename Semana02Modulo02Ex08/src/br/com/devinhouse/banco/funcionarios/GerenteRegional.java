package br.com.devinhouse.banco.funcionarios;

public class GerenteRegional extends Gerente {

	public GerenteRegional(String nome, String sobreNome, String cpf, double salario, String senha, int numeroDeFuncionariosGerenciados) {
		super(nome, sobreNome, cpf, salario, senha, numeroDeFuncionariosGerenciados);
	}
	
	public double calcularBonificacao() {
		return this.salario * .15 + 1000;
	}
}
