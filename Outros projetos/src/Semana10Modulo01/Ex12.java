package Semana10Modulo01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Inform um número inteiro: ");
		numero = cadastro.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("Parabéns, você informou um número PAR!");
		} else {
			System.out.print("Parabéns, você informou um número IMPAR!");
		}
	}

}
