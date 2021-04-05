package br.com.devinhouse.batalhafinal.criadores;

import br.com.devinhouse.batalhafinal.classes.Arqueiro;
import br.com.devinhouse.batalhafinal.classes.Guerreiro;
import br.com.devinhouse.batalhafinal.classes.Mago;
import br.com.devinhouse.batalhafinal.classes.Paladino;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.utils.Utilitario;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class CriadorClasse {
	public static Jogador CriadorDeClasse(int valor) throws TextoInvalidoException {
		Jogador escolhaDeClasse = null;
		String armas = null;
		
		switch (valor) {
			case 1:
				armas = "[5] Arco - [6] Besta";
				return escolhaDeClasse = new Arqueiro(0, 0, 0, EntradaScanner.entradaDeNome(), 
					EntradaScanner.entradaDeGenero(), null, CriadorArma.CriadorDeArma(valor, armas));
			case 2:
				armas = "[1] Espada - [2] Machado";
				return escolhaDeClasse = new Guerreiro(0, 0, 0, EntradaScanner.entradaDeNome(), 
					EntradaScanner.entradaDeGenero(), null, CriadorArma.CriadorDeArma(valor, armas));
			case 3:
				armas = "[7] Cajado - [8] Livro de magias";
				return escolhaDeClasse = new Mago(0, 0, 0, EntradaScanner.entradaDeNome(), 
					EntradaScanner.entradaDeGenero(), null, CriadorArma.CriadorDeArma(valor, armas));
			case 4:
				armas = "[3] Martelo - [4] Clava";
				return escolhaDeClasse = new Paladino(0, 0, 0, EntradaScanner.entradaDeNome(), 
					EntradaScanner.entradaDeGenero(), null, CriadorArma.CriadorDeArma(valor, armas));
			default:
				throw new TextoInvalidoException("Escolha uma das armas informadas!");
		}
	}
}
