package Semana10Modulo01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		int numero = 11;
		int resultado;
		
		while (numero < 0 || numero > 10) {
			System.out.print("Informe um n�mero de 0 � 10: ");
			numero = cadastro.nextInt();
		}
		resultado = numero;
		
		System.out.print("O fatorial do n�mero !" + numero + " �: ");
		for (int repeticao = numero - 1; repeticao > 0; repeticao--) {
			resultado += repeticao;
		}
		System.out.print(resultado);
	}

}
