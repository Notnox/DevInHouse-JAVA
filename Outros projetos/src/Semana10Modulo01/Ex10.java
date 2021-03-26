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
		
		System.out.print("Adivinhe qual número foi gerado de 1 até 5: ");
		numeroAdivinhado = cadastro.nextInt();
		
		if (numeroAdivinhado == numeroAleatorio) {
			System.out.print("Parabéns, você acertou! O número sortiado foi: " + numeroAleatorio);
		} else {
			System.out.print("Não foi dessa vez campeão! O número sortiado foi: " + numeroAleatorio);
		} 
	}

}
