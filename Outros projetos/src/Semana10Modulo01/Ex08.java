package Semana10Modulo01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		double numeroCadastro;
		int numeroTratado;
	    Scanner cadastro = new Scanner(System.in);
	    
	    System.out.print("Informe um número com 2 ou mais casas decimais:");
	    numeroCadastro = cadastro.nextDouble();
	    numeroTratado = (int) numeroCadastro;
	    
	    
	    System.out.print("Numero double: " + numeroCadastro + " - Número inteiro: " + numeroTratado);
	}

}
