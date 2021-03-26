package Semana10Modulo01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
		double nota = 0;
		double mediaSemestre;
		
		for (int bimestre = 0; bimestre < 3; bimestre++) {
			System.out.print("Inform a nota do " + (bimestre + 1) + " bimestre: ");
			nota += cadastro.nextDouble();
		}
		
		mediaSemestre = nota / 3;
		
		System.out.printf("Sua nota final foi: %.2f", (mediaSemestre));
		
	}

}
