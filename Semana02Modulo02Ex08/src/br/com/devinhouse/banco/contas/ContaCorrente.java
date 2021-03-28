package br.com.devinhouse.banco.contas;

public class ContaCorrente extends Conta {
	
	public ContaCorrente (String nome, String sobreNome, double saldo) {
		super(nome, sobreNome, saldo);
	}
	
	public void getTipo() {
		System.out.println("Conta Corrente");
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= (valor + 0.10);
	}
}
