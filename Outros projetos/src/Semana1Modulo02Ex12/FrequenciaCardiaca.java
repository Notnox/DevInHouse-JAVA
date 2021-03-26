package Semana1Modulo02Ex12;

import java.util.Calendar;

public class FrequenciaCardiaca {
	private String nome;
	private String sobreNome;
	private String dataDeNascimento;
	private int anoDeNascimento;
	private int idade;
	
	public FrequenciaCardiaca(String nome, String sobreNome, String dataDeNascimento) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataDeNascimento = dataDeNascimento;
		this.anoDeNascimento = Integer.parseInt(getAnoDeNascimento(dataDeNascimento));
		this.idade = getIdade(anoDeNascimento);
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
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getIdade() {
		return idade;
	}
	
	private String getAnoDeNascimento(String data) {
		String array[] = new String[3];
		array = data.split("/");
		return array[2];
	}
	private int getIdade(int ano) {
		Calendar calendario = Calendar.getInstance();
		int anoAtual = calendario.get(Calendar.YEAR);
		return anoAtual- this.anoDeNascimento;
	}
	
	public int getFrequenciaCardiaca(int idade) {
		return 220 - idade;
	}
	public String getFrequenciaCardiacaAlvo (int frequenciaCardiaca) {
		int min = (int) (frequenciaCardiaca * 0.50);
		int max = (int) (frequenciaCardiaca * 0.85);
		return "mín(" + min + ") - máx(" + max + ")";
	}
	
}
