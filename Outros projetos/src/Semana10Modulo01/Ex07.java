package Semana10Modulo01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		String sobreNome;
		String nome;
	    Scanner cadastro = new Scanner(System.in);
	    
	    System.out.print("Digite seu sobre nome:");
	    sobreNome = cadastro.next();
	    System.out.print("Digite seu nome:");
	    nome = cadastro.next();
	    
	    System.out.print("Nome: " + nome + " - Sobre Nome: " + sobreNome);
	}
}
