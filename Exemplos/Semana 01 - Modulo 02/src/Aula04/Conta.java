package Aula04;

public class Conta {
	private static int totalDeContas;
	
	private Cliente titular = new Cliente();
	private double saldoDoTitular;
	private int limite = 200;
	private boolean ativa;
	
	
	Conta() {
		Conta.totalDeContas ++;
	}
	
	public Conta(String nomeTitular, String sobreNomeTitular, String cpfTitular) {
		this();
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
		return true;
	}
	
	public String getTitular(String Info) {
		if (Info == "nome") {return this.titular.nome;}
		if (Info == "sobreNome") {return this.titular.sobreNome;}
		if (Info == "cpf") {return this.titular.cpf;}
		return "false";
	}
	
	public double getSaldo() {
		return this.saldoDoTitular + this.limite;
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
	
}
