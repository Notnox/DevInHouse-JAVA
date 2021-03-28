package br.com.devinhouse.formas.quadrilatero;

public class Trapezio extends Quadrilatero {

	public Trapezio(double cordenadaXA, double cordenadaYA, double cordenadaXB, double cordenadaYB, double cordenadaXC,
			double cordenadaYC, double cordenadaXD, double cordenadaYD) {
		super(cordenadaXA, cordenadaYA, cordenadaXB, cordenadaYB, cordenadaXC, cordenadaYC, cordenadaXD, cordenadaYD);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calcularArea() {
		double BaseMaior = super.getPontoD().getCordenadaX() - super.getPontoC().getCordenadaX();
		double BaseMenor = super.getPontoB().getCordenadaX() - super.getPontoA().getCordenadaX();
		double altura = super.getPontoA().getCordenadaY() - super.getPontoD().getCordenadaY();
		System.out.println("Área total do trapézio: " + (((BaseMaior + BaseMenor) * altura)/2) + "m²");
	}

}
