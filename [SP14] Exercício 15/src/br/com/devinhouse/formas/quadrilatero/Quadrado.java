package br.com.devinhouse.formas.quadrilatero;

public class Quadrado extends Quadrilatero {
	
	public Quadrado(double cordenadaXA, double cordenadaYA, double cordenadaXB, double cordenadaYB,
			double cordenadaXC, double cordenadaYC, double cordenadaXD, double cordenadaYD) {
		super(cordenadaXA, cordenadaYA, cordenadaXB, cordenadaYB, cordenadaXC, cordenadaYC, cordenadaXD, cordenadaYD);
	}
	
	@Override
	public void calcularArea() {
		double comprimento = super.getPontoD().getCordenadaX() - super.getPontoA().getCordenadaX();
		double altura = super.getPontoA().getCordenadaY() - super.getPontoD().getCordenadaY();
		System.out.println("Área total do quadrado: " + (comprimento * altura) + "m²");
	}
}
