package br.com.devinhouse.batalhafinal.criadores;

import java.util.Scanner;

import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Classe;
import br.com.devinhouse.batalhafinal.excecoes.TextoInvalidoException;
import br.com.devinhouse.batalhafinal.utils.Utilitario;

public class CriadorArma {

	public static Arma CriadorDeArma(int classes, String armas) {
		Arma arma = null;	
		int numeroDeEntrada;
		do {
			Scanner sc = new Scanner(System.in);
			try {				
				Utilitario.limpadorDeTela();
				System.out.println("Eu sempre quis ser um " + Classe.getClasse(classes) + ", bem em fim, escolha uma arma abaixo: ");
				System.out.println(armas);
				System.out.print("Escrevendo: ");
				numeroDeEntrada = sc.nextInt();
				arma = Utilitario.verificadorDeArma(numeroDeEntrada, classes);
			} catch (TextoInvalidoException tie) {
				Utilitario.limpadorDeTela();
				System.err.println(tie.getMessage());
				sc.nextLine();
			}
		} while(Utilitario.arma);
		
		return arma;
	}
}
