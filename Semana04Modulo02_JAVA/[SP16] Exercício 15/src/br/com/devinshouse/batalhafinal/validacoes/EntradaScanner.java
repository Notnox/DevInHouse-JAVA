package br.com.devinshouse.batalhafinal.validacoes;

import java.util.Scanner;

import br.com.devinhouse.batalhafinal.criadores.CriadorClasse;
import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Classe;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinhouse.batalhafinal.utils.Utilitario;

public class EntradaScanner {
	
	public static boolean EntradaParaRenovacao() {
		int opcao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Fa?a a sua escolhar:");
				System.out.println("[1] Pegar armaduras novas - [2] Minhas armaduras atuais est?o ?timas");
				System.out.print("Escrevendo: ");
				opcao = sc.nextInt();
				Utilitario.verificadorParaRenovarArmaduras(opcao);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.armaduras);
		if (opcao == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean EntradaParaPocao() {
		int opcao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Fa?a a sua escolhar:");
				System.out.println("[1] Usar po??o da mesa - [2] N?o preciso dessa po??o");
				System.out.print("Escrevendo: ");
				opcao = sc.nextInt();
				Utilitario.verificadorParaUsoDePocao(opcao);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.pocao);
		if (opcao == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean EntradaParaAtacar() {
		int opcao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Fa?a a sua escolhar:");
				System.out.println("[1] Iniciar o ataque - [2] Esperar pelo momento certo");
				System.out.print("Escrevendo: ");
				opcao = sc.nextInt();
				Utilitario.verificadorParaAtaque(opcao);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.ataque);
		if (opcao == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public static int EntradaParaMovimentacao() {
		int movimentacao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Fa?a a sua escolhar:");
				System.out.println("[1] Andando cuidadosamente - [2] Correndo - [3] Saltado");
				System.out.print("Escrevendo: ");
				movimentacao = sc.nextInt();
				Utilitario.verificadorDaMovimentacao(movimentacao);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.desistir);
		return movimentacao;
	}
	
	public static String entradaDeNome() {
		String nome = null;		
		do {
			Scanner sc = new Scanner(System.in);
			try {			
				System.out.println("Como devemos lhe chamar?");
				System.out.print("Escrevendo: ");
				nome = sc.next();
				Utilitario.verificadorDeNome(nome);
			} catch (TextoInvalidoException tie) {
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
				System.out.println("Informe seu g?nero, 'F' para Feminino ou 'M' para Masculino.");
				System.out.print("Escrevendo: ");
				genero = sc.next();
				Utilitario.verificadorDeGenero(genero);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.genero);
		return genero;
	}
	
	public static void entradaDaMotivacao(Jogador player) {
		int valor = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Informe qual ? a sua motiva??o:");
				System.out.println("[1] Vingan?a - [2] Gl?ria");
				System.out.print("Escrevendo: ");
				valor = sc.nextInt();
				Utilitario.verificadorDaMotivacao(valor);
				player.setMotivacao(Motivacao.getMotivacao(valor));
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.motivacao);
	}
	
	public static Jogador EntradaDeClasse() {
		Jogador novoChar = null;
		int classe = 0;		
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Qual classe representa melhor o seu estilo de jogo? Escolha uma entre a lista abaixo:");
				System.out.println("[1] Arqueiro - [2] Guerreiro - [3] Mago - [4] Paladino");
				System.out.print("Escrevendo: ");
				classe = sc.nextInt();
				novoChar = CriadorClasse.CriadorDeClasse(classe);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			} finally {
				sc.nextLine();
			}
		} while(Utilitario.classe);
		
		return novoChar;
	}
	
	public static boolean EntradaParaDesistir() {
		int opcao = 0;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Fa?a a sua escolhar:");
				System.out.println("[1] Seguir em frente - [2] Desistir");
				System.out.print("Escrevendo: ");
				opcao = sc.nextInt();
				Utilitario.verificadorDaDesistencia(opcao);
			} catch (TextoInvalidoException tie) {
				System.err.println(tie.getMessage());
			}
		} while(Utilitario.desistir);
		if (opcao == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
