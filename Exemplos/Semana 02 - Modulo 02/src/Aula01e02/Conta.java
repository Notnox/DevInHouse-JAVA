package Aula01e02;

public class Conta {
	private static int totalDeContas;
	
	private Cliente titular = new Cliente();
	private double saldoDoTitular;
	private int limite = 0;
	private boolean ativa;
	
	
	
	
	public Conta(String nomeTitular, String sobreNomeTitular, String cpfTitular) {
		//this();
		this.titular.nome = nomeTitular;
		this.titular.sobreNome = sobreNomeTitular;
		this.titular.cpf = cpfTitular;
	}
	
	public Conta(String nomeTitular, String sobreNomeTitular, String cpfTitular, double saldo) {
		this(nomeTitular, sobreNomeTitular, cpfTitular);
		this.saldoDoTitular = saldo;
	}
	
	public boolean sacar(double valor) {
		if ((this.saldoDoTitular - valor) >= this.limite) {
			this.saldoDoTitular -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		this.saldoDoTitular += valor;
		System.out.printf("Valor de R$ %.2f depositado com sucesso!%n", valor);
		return true;
	}
	
	public String getTitular(String Info) {
		if (Info == "nome") {return this.titular.nome;}
		if (Info == "sobreNome") {return this.titular.sobreNome;}
		if (Info == "cpf") {return this.titular.cpf;}
		return "false";
	}
	
	public void imprimeSaldo() {
		System.out.printf("O cliente %s %s possui R$%.2f de saldo. %n", this.titular.nome, this.titular.sobreNome, this.saldoDoTitular);
	}
	
	public double getSaldo() {
		return this.saldoDoTitular;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s.%n%s: R$%.2f. %n%s: %s",
				"Nome", this.titular.nome, this.titular.sobreNome, 
				"Saldo", this.saldoDoTitular, 
				"Situação da conta", (this.ativa) ? "Ativa" : "Inatíva");
	}
	
	@Override
	public Object clone() {
		try {
			return (Conta) super.clone();
		} catch (CloneNotSupportedException e) {
			return new Conta(this.titular.nome, this.titular.sobreNome,  this.titular.cpf, this.saldoDoTitular);
		}
	}
	
}
