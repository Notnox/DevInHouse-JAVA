package br.com.devinhouse.batalhafinal.personagens;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.interfaces.Atacante;
import br.com.devinhouse.batalhafinal.utils.Utilitario;

public class Armadilha implements Atacante {
	
	private Arma arma;
	private final int pontosDeAtaque;
	
	public Armadilha() {
		pontosDeAtaque = 5;
		arma = Arma.ARMADILHA;
	}
	
	@Override
	public String atacar(Personagem alvo) {
		int rolarDados = Utilitario.rolarDado(1, 10);
		
		if (rolarDados == 1) {
			return "O ataque da armadilha pegou de raspão e você não sofreu dano.";
		}
		
		int danoSofrido = pontosDeAtaque + arma.getDano(arma) + rolarDados;
		
		alvo.receberDano(danoSofrido);
		
		return "Você sofreu " + danoSofrido + " de dano e agora possui " + alvo.getPontosDeVida() + " pontos de vida.";
		
	}

}
