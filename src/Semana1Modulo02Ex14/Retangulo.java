package Semana1Modulo02Ex14;

public class Retangulo {
	private double largura = 1;
	private double comprimento = 1;
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = verificaNumeroInvalido(largura);
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = verificaNumeroInvalido(comprimento);
	}
	
	private double verificaNumeroInvalido(double valor) {
		if (valor < 0 || valor > 20) {return 1;}
		return valor;
	}
	
	public double calculaArea() {
		return largura * comprimento;
	}
	
	/*Forneça os métodos que 
	 * calculam o perímetro e a área do retângulo. A classe tem métodos set e 
	 * get para o comprimento e a largura. Os métodos set devem verificar se 
	 * comprimento e largura são, cada um, números de ponto flutuante maiores 
	 * que 0,0 e menores que 20,0. Escreva um programa para testar a classe Retangulo.*/
}
