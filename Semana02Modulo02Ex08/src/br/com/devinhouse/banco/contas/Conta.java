package br.com.devinhouse.banco.contas;

import br.com.devinhouse.banco.funcionarios.Funcionario;

public class Conta {
	private static int numeroDeContas;
	Funcionario funcionario;
	
	public Conta(String nome, String sobreNome) {
		numeroDeContas++;
	}
	
	public void depositar(double valor) {
		double valorTotal = this.funcionario.getSalario() + valor;
		this.funcionario.setSalario(valorTotal);
	}
	
	public void sacar(double valor) {
		double valorFinal = this.funcionario.getSalario() - valor;
		this.funcionario.setSalario(valorFinal);
	}
	
	public void transferir(double valor, Conta conta) {
		sacar(valor);
		conta.depositar(valor);
	}
}
