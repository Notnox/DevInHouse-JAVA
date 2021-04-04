package br.com.devinhouse.batalhafinal.utils;

import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;

public class Utilitario {
	
	public static boolean nome = true;
	public static boolean genero = true;
	
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
