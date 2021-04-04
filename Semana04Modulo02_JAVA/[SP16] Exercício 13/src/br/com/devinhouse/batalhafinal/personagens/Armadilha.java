package br.com.devinhouse.batalhafinal.personagens;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.interfaces.Atacante;

public class Armadilha implements Atacante {
	
	private Arma arma;
	private int pontosDeAtaque;
	
	public Armadilha() {
		this.pontosDeAtaque = 5;
		arma = Arma.ARMADILHA;
	}
	
	@Override
	public void atacar(Object alvo) {

	}

}
