package br.com.devinshouse.batalhafinal.validacoes;

import java.util.Scanner;

import br.com.devinhouse.batalhafinal.criadores.CriadorClasse;
import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Classe;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinhouse.batalhafinal.utils.Utilitario;

public class EntradaScanner {
	public static String entradaDeNome() {
		String nome = null;		
		do {
			Scanner sc = new Scanner(System.in);
			try {			
				Utilitario.limpadorDeTela();
				System.out.println("Como devemos lhe chamar?");
				System.out.print("Escrevendo: ");
				nome = sc.next();
				Utilitario.verificadorDeNome(nome);
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
		
			}
		} while(Utilitario.nome);
		return nome;
	}
	
	public static String entradaDeGenero() {
		String genero = null;		
		do {
			Scanner sc = new Scanner(System.in);
			try {
				Utilitario.limpadorDeTela();
				System.out.println("Informe seu g�nero, 'F' para Feminino ou 'M' para Masculino.");
				System.out.print("Escrevendo: ");
				genero = sc.next();
				Utilitario.verificadorDeGenero(genero);
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.genero);
		return genero;
	}
	
	public static Personagem EntradaDeClasse() {
		Personagem novoChar = null;
		int classe = 0;		
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Qual classe representa melhor o seu estilo de jogo? Escolha uma entre a lista abaixo:");
				System.out.println("[1] Arqueiro - [2] Guerreiro - [3] Mago - [4] Paladino");
				System.out.print("Escrevendo: ");
				classe = sc.nextInt();
				novoChar = CriadorClasse.CriadorDeClasse(classe);
				Utilitario.limpadorDeTela();
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
			} finally {
				sc.nextLine();
			}
		} while(Utilitario.classe);
		
		System.out.println("Classe criada!");
		return novoChar;
	}
	
	
}
