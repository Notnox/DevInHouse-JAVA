package br.com.devinhouse.batalhafinal.main;

import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) {
		Personagem player = EntradaScanner.EntradaDeClasse();
		
		System.out.println(player);
	}
}
