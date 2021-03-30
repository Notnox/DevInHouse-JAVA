package br.com.devinhouse.banco.conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, String sobreNome, double saldo) {
		super(nome, sobreNome, saldo);
	}
	
	@Override
	public String getTipo() {
		return "conta corrente";
	}
}
