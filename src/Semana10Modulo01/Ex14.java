package Semana10Modulo01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner cadastro = new Scanner(System.in);
		double numero[] = new double[2];
		double resultado = 0;
		String operacao;
		
		for (int calculo = 0; calculo < 2; calculo++) {
			System.out.print("Informe o número " + (calculo + 1) + ":");
			numero[calculo] = cadastro.nextDouble();
		}
		
		System.out.print("Informe a operação 'somar, subtrair, dividir, multiplicar': ");
		operacao = cadastro.next();
		
		switch (operacao) {
		case "somar": {
			resultado = numero[0] + numero[1];
			break;
		}
		case "subtrair": {
			resultado = numero[0] - numero[1];
			break;
		}
		case "dividir": {
			resultado = numero[0] / numero[1];
			break;
		}
		case "multiplicar": {
			resultado = numero[0] * numero[1];
			break;
		}
		}
		
		System.out.print("Resultado é: " + resultado);
	}
	
}
