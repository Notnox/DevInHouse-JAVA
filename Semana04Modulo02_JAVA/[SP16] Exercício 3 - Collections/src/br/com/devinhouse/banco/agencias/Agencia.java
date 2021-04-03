package br.com.devinhouse.banco.agencias;

import java.util.ArrayList;
import java.util.List;

import br.com.devinhouse.banco.conta.Conta;

public class Agencia {
	private List<Conta> contas;
	private String numeroDaAgencia;
	
	public Agencia(String numeroDaAgencia) {
		this.contas = new ArrayList<Conta>();
		this.numeroDaAgencia = numeroDaAgencia;
	}
	
	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void adiciona(Conta conta) {
		contas.add(conta);
	}
	
	public int getQuantidadeDeContas() {
		return contas.size();
	}
	
}
