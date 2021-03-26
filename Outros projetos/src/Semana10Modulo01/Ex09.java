package Semana10Modulo01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		String nome;
		int comprimentoDoNome;
	    Scanner cadastro = new Scanner(System.in);
	    
	    System.out.print("Digite seu nome:");
	    nome = cadastro.next();
	    comprimentoDoNome = nome.length();
	    
	    System.out.print("Nome: " + nome + " - possui  " + comprimentoDoNome + " letras.");
	}

}
