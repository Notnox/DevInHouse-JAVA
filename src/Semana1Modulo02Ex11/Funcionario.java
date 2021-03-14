package Semana1Modulo02Ex11;

public class Funcionario {
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	
	public Funcionario (String nome, String sobreNome, double salarioMensal) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioMensal = getValorPositivo(salarioMensal);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = getValorPositivo(salarioMensal);
	}
	
	private double getValorPositivo(double valor) {
		if (valor > 0) {return valor;}
		return 0;
	}
	
	public double getCalculoSalarial(int meses) {
		return this.salarioMensal * meses;
	}
	
	public double getAumentoSalarial(double porcentagem) {
		return this.salarioMensal += (this.salarioMensal * (porcentagem/100));
	}

}
