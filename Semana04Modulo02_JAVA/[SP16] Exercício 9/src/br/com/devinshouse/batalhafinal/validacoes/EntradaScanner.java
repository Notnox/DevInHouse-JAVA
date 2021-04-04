package br.com.devinshouse.batalhafinal.validacoes;

import java.util.Scanner;

import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.utils.Utilitario;

public class EntradaScanner {
	public static String entradaDeNome() {
		String nome = null;		
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Como devemos lhe chamar?");
				System.out.print("Escrevendo: ");
				nome = sc.next();
				Utilitario.verificadorDeNome(nome);
				Utilitario.limpadorDeTela();
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
				sc.nextLine();
			}
		} while(Utilitario.nome);
		return nome;
	}
	
	public static String entradaDeGenero() {
		String genero = null;		
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				System.out.println("Informe seu gênero, 'F' para Feminino ou 'M' para Masculino.");
				System.out.print("Escrevendo: ");
				genero = sc.next();
				Utilitario.verificadorDeGenero(genero);
				Utilitario.limpadorDeTela();
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
				sc.nextLine();
			}
		} while(Utilitario.genero);
		return genero;
	}
}
