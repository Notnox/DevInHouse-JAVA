package Semana10Modulo01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		int numero;
		int raiz;
		int resultado;
		String operacao;
		
		System.out.print("Informe o número: ");
		numero = cadastro.nextInt();
		resultado = numero;
		System.out.print("Informe a raiz: ");
		raiz = cadastro.nextInt();
		System.out.print("Escolha entre PA ou PG: ");
		operacao = cadastro.next();
		
		System.out.print("O resultado do calculo de " + operacao + " com número inicial de " +
				numero + " e raiz de " + raiz + " é: " + resultado);
		
		switch (operacao) {
			case "PA": {
				for (int repeticao = 0; repeticao < 9; repeticao++) {
					resultado += raiz;
					System.out.print( " - " + resultado);
				}
				break;
			}
			case "PG": {
				for (int repeticao = 0; repeticao < 9; repeticao++) {
					resultado *= raiz;
					System.out.print( " - " + resultado);
				}
				break;
			}
		}
		
	}

}
