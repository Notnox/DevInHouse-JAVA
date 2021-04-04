package br.com.devinhouse.batalhafinal.classes;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.personagens.Jogador;

public class Guerreiro extends Jogador {
	
	public Guerreiro(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo,
			Motivacao motivacao, Arma arma) {
		super(pontosDeVida, pontosDeAtaque, pontosDeDefesa, nome, sexo, motivacao, arma);
		super.setPontosDeAtaque(15);
		super.setPontosDeDefesa(15);
		super.setArma(arma);
	}

	@Override
	public void atacar(Object alvo) {
		// TODO Auto-generated method stub
		
	}

}
