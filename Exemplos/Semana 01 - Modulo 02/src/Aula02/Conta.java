package Aula02;

public class Conta {
	String nomeDoTitular;
	double saldoDoTitular;
	
	boolean sacar(double valor) {
		if (this.saldoDoTitular >= valor) {
			this.saldoDoTitular -= valor;
			return true;
		}
		return false;
	}
	
	boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	void depositar(double valor) {
		this.saldoDoTitular += valor;
	}
	
	double getSaldoDoTitular() {
		return this.saldoDoTitular;
	}
}
