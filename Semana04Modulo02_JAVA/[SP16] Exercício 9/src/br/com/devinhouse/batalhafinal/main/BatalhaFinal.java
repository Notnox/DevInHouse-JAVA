package br.com.devinhouse.batalhafinal.main;

import java.util.Scanner;

import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.utils.Utilitario;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) throws TextoInvalidoException {
		String nome = EntradaScanner.entradaDeNome();
		String genero = EntradaScanner.entradaDeGenero();
		
		
		System.out.printf("Guerreiro %s do sexo %s!",nome, genero);
	}
}
