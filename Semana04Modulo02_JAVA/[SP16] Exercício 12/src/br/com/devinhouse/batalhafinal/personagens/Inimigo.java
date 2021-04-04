package br.com.devinhouse.batalhafinal.personagens;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.interfaces.Atacante;

public abstract class Inimigo extends Personagem implements Atacante {
	private Arma arma;
	
	public Inimigo(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, Arma arma) {
		super(pontosDeVida, pontosDeAtaque, pontosDeDefesa);
		this.arma = arma;
	}

	@Override
	public void atacar(Object alvo) {
		
	}

}
