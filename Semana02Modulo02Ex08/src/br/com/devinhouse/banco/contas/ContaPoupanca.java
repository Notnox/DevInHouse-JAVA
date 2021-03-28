package br.com.devinhouse.banco.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (String nome, String sobreNome, double saldo) {
		super(nome, sobreNome, saldo);
	}
	
	public void getTipo() {
		System.out.println("Conta Poupança");
	}
	
	public void renderJurosDePoupanca() {
		double rendimento = super.getSaldo() * 0.01;
		
		super.depositar(rendimento);
	}
}
