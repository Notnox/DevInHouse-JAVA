package br.com.devinhouse.batalhafinal.utils;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;

public class Utilitario {
	
	public static boolean nome = true;
	public static boolean genero = true;
	public static boolean classe = true;
	public static boolean arma = true;
	
	public static void verificadorDeNome(String texto) throws TextoInvalidoException {
		if (texto.length() > 0) {
			nome = false;
		} else {
			throw new TextoInvalidoException("Qual é o nome do jogador?"); 	
		}
	}
	
public static void verificadorDeGenero(String texto) throws TextoInvalidoException {
		if (texto.intern() == "M" || texto.intern() == "F") {
			genero = false; 
		} else {
			throw new TextoInvalidoException("Escolha um dos gêneros informados!");
		}
	}

public static Arma verificadorDeArma (int armas, int classes) throws TextoInvalidoException {
	
	Arma armaEscolhida = Arma.ESPADA;
		switch (classes) {
			case 1:
				if (armas == 5 || armas == 6) {
					arma = false;
					return armaEscolhida.getArma(armas);
				} else {
					throw new TextoInvalidoException("Escolha uma das armas informadas!");
				}
			case 2:
				if (armas == 1 || armas == 2) {
					arma = false;
					return armaEscolhida.getArma(armas);
				} else {
					throw new TextoInvalidoException("Escolha uma das armas informadas!");
				}
			case 3:
				if (armas == 7 || armas == 8) {
					arma = false;
					return armaEscolhida.getArma(armas);
				} else {
					throw new TextoInvalidoException("Escolha uma das armas informadas!");
				}
			case 4:
				if (armas == 3 || armas == 4) {
					arma = false;
					return armaEscolhida.getArma(armas);
				} else {
					throw new TextoInvalidoException("Escolha uma das armas informadas!");
				}
			default:
				throw new TextoInvalidoException("Escolha uma das classes informadas!");
		}
}

public static void limpadorDeTela() {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
}
}
