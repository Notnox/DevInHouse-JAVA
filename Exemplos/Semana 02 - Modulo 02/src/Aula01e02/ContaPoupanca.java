package Aula01e02;

public class ContaPoupanca extends Conta {
	private double limite;
	
	public ContaPoupanca(String nome, String sobreNome, String cpf) {
		super(nome, sobreNome, cpf);
		System.out.print("Conta corrente!");
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
