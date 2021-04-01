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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FormaBidimensional that = (FormaBidimensional) o;
		return super.duasDimenssoes.getPontoA().equals(that.duasDimenssoes.getPontoA()) &&
				super.duasDimenssoes.getPontoB().equals(that.duasDimenssoes.getPontoB()) &&
				super.duasDimenssoes.getPontoC().equals(that.duasDimenssoes.getPontoC()) &&
				super.duasDimenssoes.getPontoD().equals(that.duasDimenssoes.getPontoD()) ;
	}

	
}
