package Aula03;

public class Conta {
	Cliente titular = new Cliente();
	double saldoDoTitular;
	
	Conta(double saldo) {
		System.out.println("Objeto conta criado!");
		this.saldoDoTitular = saldo;
	}
	
	Conta(String nomeTitular, String sobreNomeTitular, String cpfTitular) {
		this.titular.nome = nomeTitular;
		this.titular.sobreNome = sobreNomeTitular;
		this.titular.cpf = cpfTitular;
	}
	
	Conta(String nomeTitular, String sobreNomeTitular, String cpfTitular, double saldo) {
		this(nomeTitular, sobreNomeTitular, cpfTitular);
		this.saldoDoTitular = saldo;
	}
	
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
