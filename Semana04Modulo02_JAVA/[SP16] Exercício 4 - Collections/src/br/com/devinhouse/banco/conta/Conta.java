package br.com.devinhouse.banco.conta;

public abstract class Conta {
	private String nome;
	private String sobreNome;
	private double saldo;
	
	public Conta(String nome, String sobreNome, double saldo) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.saldo = saldo;
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

	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		if (this.saldo > valor) {this.saldo -= valor;}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public abstract String getTipo();
}
