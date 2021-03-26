package Semana1Modulo02Ex17;

public class ContaPoupanca {
	private static double taxaDeJurosAnual = 0.0;
	private double saldo;
	
	public ContaPoupanca(Double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public static double getTaxaDeJurosAnual() {
		return taxaDeJurosAnual;
	}

	public static void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void alterarTaxaAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}
	
	public double calcularJuroMensal () {
		this.saldo += (this.saldo * (taxaDeJurosAnual / 12)) ;
		return this.saldo;
	}
}
