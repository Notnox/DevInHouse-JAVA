package Semana1Modulo02Ex06;

public class Porta {
	String cor;
	double largura;
	double altura;
	double profundidade;
	boolean aberta;
	
	public Porta (String cor, double largura, double altura, double profundidade) {
		this.cor = cor;
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
		this.aberta = false;
	}
	
	public String getCor() {
		return cor;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	
	public void interagirComPorta() {
		this.aberta = !this.aberta;
	}
	public void pintarPorta(String cor) {
		this.cor = cor;
	}
	
	public boolean verificarPorta() {
		return this.aberta;
	}
	
}
