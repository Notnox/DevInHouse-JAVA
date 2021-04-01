package br.com.devinshouse.geometria.formas;

public class FormaBidimensional extends Forma {
	
	public FormaBidimensional(double cordenadaXA, double cordenadaYA, double cordenadaXB, double cordenadaYB,
			double cordenadaXC, double cordenadaYC, double cordenadaXD, double cordenadaYD) {
		super(cordenadaXA, cordenadaYA, cordenadaXB, cordenadaYB, cordenadaXC, cordenadaYC, cordenadaXD, cordenadaYD);
	}

	@Override
	public double getArea() {
		double comprimento = super.duasDimenssoes.getPontoDX() - super.duasDimenssoes.getPontoAX();
		double altura = super.duasDimenssoes.getPontoAY() - super.duasDimenssoes.getPontoDY();
		return comprimento * altura;
	}
}
