package br.com.devinhouse.banco.funcionarios;

public class Gerente extends Funcionario {
	private String senha;
	private int numeroDeFuncionariosGerenciados;
	
	public Gerente(String nome, String sobreNome, String cpf, double salario, String senha, int numeroDeFuncionariosGerenciados) {
		super(nome, sobreNome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	@Override
	public double calcularBonificacao() {
		return this.salario * .15;
	}
}
