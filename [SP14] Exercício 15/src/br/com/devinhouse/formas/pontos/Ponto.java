package br.com.devinhouse.formas.pontos;

public class Ponto {
	private double cordenadaX;
	private double cordenadaY;
	
	public Ponto(double cordenadaX, double cordenadaY) {
		this.cordenadaX = cordenadaX;
		this.cordenadaY = cordenadaY;
	}

	public double getCordenadaX() {
		return cordenadaX;
	}

	public void setCordenadaX(double cordenadaX) {
		this.cordenadaX = cordenadaX;
	}

	public double getCordenadaY() {
		return cordenadaY;
	}

	public void setCordenadaY(double cordenadaY) {
		this.cordenadaY = cordenadaY;
	}
	
	public String getPonto() {
		return "Ponto";
	}
}
