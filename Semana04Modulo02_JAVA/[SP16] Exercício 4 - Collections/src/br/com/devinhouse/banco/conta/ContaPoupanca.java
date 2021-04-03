package br.com.devinhouse.banco.conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String nome, String sobreNome, double saldo) {
		super(nome, sobreNome, saldo);
	}
	
	@Override
	public String getTipo() {
		return "conta poupança";
	}

}
