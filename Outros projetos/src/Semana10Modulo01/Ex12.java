package Semana10Modulo01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Inform um n�mero inteiro: ");
		numero = cadastro.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("Parab�ns, voc� informou um n�mero PAR!");
		} else {
			System.out.print("Parab�ns, voc� informou um n�mero IMPAR!");
		}
	}

}
