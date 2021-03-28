package br.com.devinhouse.banco.contas;

import br.com.devinhouse.banco.funcionarios.Funcionario;

public class Conta {
	private static int numeroDeContas;
	protected double saldo;
	Funcionario funcionario;
	
	public Conta(String nome, String sobreNome, double saldo) {
		this.saldo = saldo;
		numeroDeContas++;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta conta) {
		sacar(valor);
		conta.depositar(valor);
	}
	
	public void getTipo() {
		System.out.println("Conta");
	}
	
}
