package Semana10Modulo01;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(5);
		int numeroAdivinhado;
		Scanner cadastro = new Scanner(System.in);
		
		while (numeroAleatorio == 0) {
			numeroAleatorio = random.nextInt(5);
		}
		
		System.out.print("Adivinhe qual n�mero foi gerado de 1 at� 5: ");
		numeroAdivinhado = cadastro.nextInt();
		
		if (numeroAdivinhado == numeroAleatorio) {
			System.out.print("Parab�ns, voc� acertou! O n�mero sortiado foi: " + numeroAleatorio);
		} else {
			System.out.print("N�o foi dessa vez campe�o! O n�mero sortiado foi: " + numeroAleatorio);
		} 
	}

}
