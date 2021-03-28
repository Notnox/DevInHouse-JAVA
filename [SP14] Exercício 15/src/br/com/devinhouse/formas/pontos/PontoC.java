package br.com.devinhouse.formas.pontos;

public class PontoC extends Ponto {

	public PontoC(double cordenadaX, double cordenadaY) {
		super(cordenadaX, cordenadaY);
	}
	
	@Override
	public String getPonto() {
		return "Ponto C: " + getCordenadaX() + "," + getCordenadaY();
	}
}
