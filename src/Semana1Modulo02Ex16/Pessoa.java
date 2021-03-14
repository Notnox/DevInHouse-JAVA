package Semana1Modulo02Ex16;

public class Pessoa {
	private String nome;
	private String cpf;
	
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean validaCPF(String cpf){
		if (cpf.length() == 11) {
			this.cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) 
			+ "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

			return true;
		}
		return false;
	}
}
