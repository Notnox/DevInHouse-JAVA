package br.com.devinhouse.banco.seguros;

import br.com.devinhouse.banco.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{
	private String titular;
	private double valorDoSeguro;
	private int numeroDaApolice;
	
	public SeguroDeVida(String titular, double valorDoSeguro, int numeroDaApolice) {
		this.titular = titular;
		this.valorDoSeguro = valorDoSeguro;
		this.numeroDaApolice = numeroDaApolice;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValorDoSeguro() {
		return valorDoSeguro;
	}

	public void setValorDoSeguro(double valorDoSeguro) {
		this.valorDoSeguro = valorDoSeguro;
	}

	public int getNumeroDaApolice() {
		return numeroDaApolice;
	}

	public void setNumeroDaApolice(int numeroDaApolice) {
		this.numeroDaApolice = numeroDaApolice;
	}

	@Override
	public double getValorImposto() {
		return 42.0 + (this.valorDoSeguro * 0.02);
	}
	
	
	
}
