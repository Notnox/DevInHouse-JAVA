package br.com.devinhouse.batalhafinal.classes;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.personagens.Inimigo;

public class Alquimista extends Inimigo {

	private Arma arma;
	private final int VIDA_MAXIMA = 100;
	
	public Alquimista(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, Arma arma) {
		super(pontosDeVida, pontosDeAtaque, pontosDeDefesa, arma);
		super.setPontosDeVida(VIDA_MAXIMA);
		super.setPontosDeAtaque(10);
		super.setPontosDeDefesa(15);
		this.arma = Arma.CAJADO;
	}

}
