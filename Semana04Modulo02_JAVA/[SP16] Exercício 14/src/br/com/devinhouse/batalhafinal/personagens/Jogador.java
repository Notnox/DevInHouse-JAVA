package br.com.devinhouse.batalhafinal.personagens;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.interfaces.Atacante;

public abstract class Jogador extends Personagem implements Atacante {
	private String nome;
	private String sexo;
	private Motivacao motivacao;
	private Arma arma;
	private final int VIDA_MAXIMA = 200;
	
	public Jogador(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo,
			Motivacao motivacao, Arma arma) {
		super(pontosDeVida, pontosDeAtaque, pontosDeDefesa);
		this.nome = nome;
		this.sexo = sexo;
		super.setPontosDeVida(VIDA_MAXIMA);
		this.arma = arma;
	}

	public Arma getArma() {
		return arma;
	}
	
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setMotivacao(Motivacao valor) {
		motivacao = valor;
	}
	
	public Motivacao getMotivacao() {
		return motivacao;
	}
	
	
}
