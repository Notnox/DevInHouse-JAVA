package br.com.devinhouse.formas.pontos;

public class PontoA extends Ponto {
	
	public PontoA(double cordenadaX, double cordenadaY) {
		super(cordenadaX, cordenadaY);
	}
	
	@Override
	public String getPonto() {
		return "Ponto A: " + getCordenadaX() + "," + getCordenadaY();
	}
}
