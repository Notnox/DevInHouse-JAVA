package Semana1Modulo02Ex13;

import java.util.Calendar;

public class PerfilDeSaude {
	private String nome;
	private String sobreNome;
	private String sexo;
	private String dataDeNascimento;
	private double altura;
	private double peso;
	private int idade;
	private int anoDeNascimento;
	private int frequenciaCardiaca;
	private int frequenciaCardiacaAlvoMin;
	private int frequenciaCardiacaAlvoMax;
	private double imc;
	
	public PerfilDeSaude(String nome, String sobreNome, String sexo, 
			String dataDeNascimento, double altura, double peso) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.altura = altura;
		this.peso = peso;
		
		this.anoDeNascimento = Integer.parseInt(setAnoDeNascimento(dataDeNascimento));
		this.idade = setIdade(anoDeNascimento);
		this.frequenciaCardiaca = setFrequenciaCardiaca(idade);
		this.frequenciaCardiacaAlvoMin = (int) setFrequenciaCardiacaAlvoMin(frequenciaCardiaca);
		this.frequenciaCardiacaAlvoMax = (int) setFrequenciaCardiacaAlvoMax(frequenciaCardiaca);
		this.imc = setImc(altura, peso);
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}
	public int getFrequenciaCardiacaAlvoMin() {
		return frequenciaCardiacaAlvoMin;
	}
	public int getFrequenciaCardiacaAlvoMax() {
		return frequenciaCardiacaAlvoMax;
	}
	public double getImc() {
		return imc;
	}
	
	private String setAnoDeNascimento(String data) {
		String array[] = new String[3];
		array = data.split("/");
		return array[2];
	}
	private int setIdade(int ano) {
		Calendar calendario = Calendar.getInstance();
		int anoAtual = calendario.get(Calendar.YEAR);
		return anoAtual - this.anoDeNascimento;
	}
	private int setFrequenciaCardiaca(int idade) {
		return 220 - idade;
	}
	private double setFrequenciaCardiacaAlvoMin(int frequenciaCardiaca) {
		return frequenciaCardiaca * 0.50;
	}
	private double setFrequenciaCardiacaAlvoMax(int frequenciaCardiaca) {
		return frequenciaCardiaca * 0.85;
	}
	private double setImc(double altura, double peso) {
		return peso / (altura * altura);
	}

	
}
