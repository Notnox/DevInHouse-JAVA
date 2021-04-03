package br.com.devinhouse.arraybidimensional.main;

public class Main {

	public static void main(String[] args) {
		int[][] table = new int[3][3];
		int totalDeElementos = 0;
		 
		for (int x = 0; x < table.length; x++) {
			for (int y = 0; y < table[x].length ; y++) {
				table[x][y] = x + y;
				totalDeElementos++;
			}
		}
		
		System.out.printf("Temos em uma array bidimensional 3x3 um total de %d elementos.%n", totalDeElementos);
		System.out.println("\nSegue os valores:");
		System.out.println("========================\n");
		for (int x = 0; x < table.length; x++) {
			for (int y = 0; y < table[x].length ; y++) {
				System.out.printf("Table[%d][%d] = %d%n", x, y, table[x][y]);
			}
		}
		System.out.println("========================");
		
	}

}
