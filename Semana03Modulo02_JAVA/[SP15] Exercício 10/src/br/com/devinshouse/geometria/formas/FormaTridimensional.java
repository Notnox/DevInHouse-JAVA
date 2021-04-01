package br.com.devinshouse.geometria.formas;

public class FormaTridimensional extends Forma {

	public FormaTridimensional(double cordenadaXA, double cordenadaYA, double cordenadaZA, double cordenadaXB,
			double cordenadaYB, double cordenadaZB, double cordenadaXC, double cordenadaYC, double cordenadaZC,
			double cordenadaXD, double cordenadaYD, double cordenadaZD, double cordenadaXE, double cordenadaYE,
			double cordenadaZE, double cordenadaXF, double cordenadaYF, double cordenadaZF, double cordenadaXG,
			double cordenadaYG, double cordenadaZG, double cordenadaXH, double cordenadaYH, double cordenadaZH) {
		super(cordenadaXA, cordenadaYA, cordenadaZA, cordenadaXB, cordenadaYB, cordenadaZB, cordenadaXC, cordenadaYC,
				cordenadaZC, cordenadaXD, cordenadaYD, cordenadaZD, cordenadaXE, cordenadaYE, cordenadaZE, cordenadaXF,
				cordenadaYF, cordenadaZF, cordenadaXG, cordenadaYG, cordenadaZG, cordenadaXH, cordenadaYH, cordenadaZH);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
			double comprimento = super.tresDimenssoes.getPontoDX() - super.tresDimenssoes.getPontoAX();
			double largura = super.tresDimenssoes.getPontoAY() - super.tresDimenssoes.getPontoDY();
			return comprimento * largura;
		}
	
	@Override
	public double getVolume() {
		double altura =  super.tresDimenssoes.getPontoAZ() - super.tresDimenssoes.getPontoEZ();
		return getArea() * altura;
	}
}
