package br.com.devinhouse.formas.pontos;

public class PontoB extends Ponto {

	public PontoB(double cordenadaX, double cordenadaY) {
		super(cordenadaX, cordenadaY);
	}
	
	@Override
	public String getPonto() {
		return "Ponto B: " + getCordenadaX() + "," + getCordenadaY();
	}
}
