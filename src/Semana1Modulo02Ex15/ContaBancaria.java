package Semana1Modulo02Ex15;

import java.util.Calendar;

public class ContaBancaria {
	private static int identificador;
	private Calendar calendario = Calendar.getInstance();
	private String nomeDoTitular;
	private int numeroDaConta;
	private int agenciaDaConta;
	private double saldo;
	private double limite;
	private String dataDeAbertura;
	
	public ContaBancaria(String nome, int numeroDeConta, int numeroDeAgencia) {
		this.identificador++;
		this.nomeDoTitular = nome;
		this.numeroDaConta = numeroDeConta;
		this.agenciaDaConta = numeroDeAgencia;
		this.saldo = 0;
		this.limite = -200;
		this.dataDeAbertura = 
				calendario.get(Calendar.DAY_OF_MONTH) + "/" +
				calendario.get(Calendar.MONTH) + "/" +
				calendario.get(Calendar.YEAR);
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public int getAgenciaDaConta() {
		return agenciaDaConta;
	}
	public void setAgenciaDaConta(int agenciaDaConta) {
		this.agenciaDaConta = agenciaDaConta;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo + (this.limite * -1) >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public void depositar(double valor) {
		System.out.println("Deposito no valor de R$" + valor + " reais feito com sucesso!");
		this.saldo += valor;
	}
	public double consultaDeSaldo() {
		return this.saldo;
	}
	public double consultaDeLimite() {
		return this.limite * -1;
	}

	public static int getIdentificador() {
		return identificador;
	}
	
	
}
