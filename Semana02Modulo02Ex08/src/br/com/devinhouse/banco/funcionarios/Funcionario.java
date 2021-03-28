package br.com.devinhouse.banco.funcionarios;

public class Funcionario {
	private String nome;
	private String sobreNome;
	private String cpf;
	protected double salario;
	
	public Funcionario (String nome, String sobreNome, String cpf, double salario) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.salario = salario;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularBonificacao() {
		return this.salario * .1;
	}

}
