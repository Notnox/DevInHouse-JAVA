package br.com.devinhouse.batalhafinal.main;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) {
		Arma espada = Arma.MACHADO_DUPLO;
		
		System.out.println(espada.getDano(espada));
	}
}
