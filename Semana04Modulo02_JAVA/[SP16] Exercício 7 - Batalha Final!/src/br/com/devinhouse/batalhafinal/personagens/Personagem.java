package br.com.devinhouse.batalhafinal.personagens;

public abstract class Personagem {
	
	private int pontosDeVida;
	private int pontosDeAtaque;
	private int pontosDeDefesa;
	
	public Personagem(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa) {
		this.pontosDeVida = pontosDeVida;
		this.pontosDeAtaque = pontosDeAtaque;
		this.pontosDeDefesa = pontosDeDefesa;
	}
	
	
}
