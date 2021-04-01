package br.com.devinshouse.geometria.formas;

import br.com.devinshouse.geometria.pontos.DuasDimensoes;
import br.com.devinshouse.geometria.pontos.TresDimensoes;

public abstract class Forma {
	protected DuasDimensoes duasDimenssoes;
	protected TresDimensoes tresDimenssoes;
	private int dimenssoes;
	
	public Forma(
			double cordenadaXA, double cordenadaYA,
			double cordenadaXB, double cordenadaYB,
			double cordenadaXC, double cordenadaYC,
			double cordenadaXD, double cordenadaYD) {
		 duasDimenssoes = new DuasDimensoes(
				cordenadaXA, cordenadaYA, 
				cordenadaXB, cordenadaYB, 
				cordenadaXC, cordenadaYC, 
				cordenadaXD, cordenadaYD);
		this.dimenssoes = 2;

	}
	
	public Forma(
			double cordenadaXA, double cordenadaYA, double cordenadaZA,
			double cordenadaXB, double cordenadaYB, double cordenadaZB,
			double cordenadaXC, double cordenadaYC, double cordenadaZC,
			double cordenadaXD, double cordenadaYD, double cordenadaZD,
			double cordenadaXE, double cordenadaYE, double cordenadaZE,
			double cordenadaXF, double cordenadaYF, double cordenadaZF,
			double cordenadaXG, double cordenadaYG, double cordenadaZG,
			double cordenadaXH, double cordenadaYH, double cordenadaZH) {
		tresDimenssoes = new TresDimensoes(
				cordenadaXA, cordenadaYA, cordenadaZA, 
				cordenadaXB, cordenadaYB, cordenadaZB, 
				cordenadaXC, cordenadaYC, cordenadaZC, 
				cordenadaXD, cordenadaYD, cordenadaZD, 
				cordenadaXE, cordenadaYE, cordenadaZE, 
				cordenadaXF, cordenadaYF, cordenadaZF, 
				cordenadaXG, cordenadaYG, cordenadaZG, 
				cordenadaXH, cordenadaYH, cordenadaZH);
		this.dimenssoes = 3;
	}
	
	public int getDimenssoes() {
		return this.dimenssoes;
	}
	
	public static void getForma(Forma f) {
		if (f.dimenssoes == 2) {
			System.out.println("Você criou uma forma bidimensional, um quadrado!!, a sua área é: " + (f.getArea()) + "m²");
		} else {
			System.out.println("Você criou uma forma tridimensional, um CUBO!!, o seu volume é: " + (f.getVolume()) + "m³");
		}
	}
	
	public double getVolume() {
		return 0;
	}

	public abstract double getArea();
}
