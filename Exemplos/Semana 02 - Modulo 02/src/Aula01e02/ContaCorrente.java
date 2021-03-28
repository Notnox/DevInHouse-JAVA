package Aula01e02;

public class ContaCorrente extends Conta {
	private double limite;
	
	public ContaCorrente(String nome, String sobreNome, String cpf) {
		super(nome, sobreNome, cpf);
	}
	
	public ContaCorrente(String nome, String sobreNome, String cpf, 
			double saldo, double limite) {
		super(nome, sobreNome, cpf, saldo);
		this.limite = limite;
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public double getSaldo() {
		return this.limite + super.getSaldo();
	}
	
	@Override
	public void imprimeSaldo() {
		super.imprimeSaldo();
		System.out.printf("E possui R$ %.2f de limite!", this.limite);
	}
}
