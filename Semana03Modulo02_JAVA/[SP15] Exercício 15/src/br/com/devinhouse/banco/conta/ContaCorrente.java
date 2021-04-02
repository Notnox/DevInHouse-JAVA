package br.com.devinhouse.banco.conta;

import br.com.devinhouse.banco.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nome, String sobreNome, double saldo) {
		super(nome, sobreNome, saldo);
	}
	
	@Override
	public String getTipo() {
		return "conta corrente";
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
