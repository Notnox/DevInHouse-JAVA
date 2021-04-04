package br.com.devinhouse.batalhafinal.classes;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;

public class Mago extends Jogador{

	public Mago(int pontosDeVida, int pontosDeAtaque, int pontosDeDefesa, String nome, String sexo,
			Motivacao motivacao, Arma arma) {
		super(pontosDeVida, pontosDeAtaque, pontosDeDefesa, nome, sexo, motivacao, arma);
		super.setPontosDeAtaque(19);
		super.setPontosDeDefesa(11);
		super.setArma(arma);
	}

	@Override
	public String atacar(Personagem alvo) {
		return null;
		// TODO Auto-generated method stub
		
	}
}
