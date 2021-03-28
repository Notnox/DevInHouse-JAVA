package br.com.devinhouse.formas.pontos;

public class PontoD extends Ponto {

	public PontoD(double cordenadaX, double cordenadaY) {
		super(cordenadaX, cordenadaY);
	}
	
	@Override
	public String getPonto() {
		return "Ponto D: " + getCordenadaX() + "," + getCordenadaY();
	}
}
