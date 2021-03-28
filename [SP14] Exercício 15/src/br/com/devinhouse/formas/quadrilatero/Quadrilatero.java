package br.com.devinhouse.formas.quadrilatero;

import br.com.devinhouse.formas.pontos.Ponto;
import br.com.devinhouse.formas.pontos.PontoA;
import br.com.devinhouse.formas.pontos.PontoB;
import br.com.devinhouse.formas.pontos.PontoC;
import br.com.devinhouse.formas.pontos.PontoD;

public class Quadrilatero {
	protected PontoA pontoA = new PontoA(0, 0);
	protected PontoB pontoB = new PontoB(0, 0);
	protected PontoC pontoC = new PontoC(0, 0);
	protected PontoD pontoD = new PontoD(0, 0);
	
	public Quadrilatero(double cordenadaXA, double cordenadaYA, double cordenadaXB, double cordenadaYB,
			double cordenadaXC, double cordenadaYC, double cordenadaXD, double cordenadaYD) {
		setPontoA(cordenadaXA, cordenadaYA);
		setPontoB(cordenadaXB, cordenadaYB);
		setPontoC(cordenadaXC, cordenadaYC);
		setPontoD(cordenadaXD, cordenadaYD);
	}

	private void setPontoA(double cordenadaX, double cordenadaY) {
		pontoA.setCordenadaX(cordenadaX);
		pontoA.setCordenadaY(cordenadaY);
	}
	
	private void setPontoB(double cordenadaX, double cordenadaY) {
		pontoB.setCordenadaX(cordenadaX);
		pontoB.setCordenadaY(cordenadaY);
	}
	
	private void setPontoC(double cordenadaX, double cordenadaY) {
		pontoC.setCordenadaX(cordenadaX);
		pontoC.setCordenadaY(cordenadaY);
	}
	
	private void setPontoD(double cordenadaX, double cordenadaY) {
		pontoD.setCordenadaX(cordenadaX);
		pontoD.setCordenadaY(cordenadaY);
	}
	
	public PontoA getPontoA() {
		return pontoA;
	}
	
	public PontoB getPontoB() {
		return pontoB;
	}
	
	public PontoC getPontoC() {
		return pontoC;
	}
	
	public PontoD getPontoD() {
		return pontoD;
	}
	
	public void getPonto(Ponto ponto) {
		System.out.println(ponto.getPonto());
	}
	
	public void calcularArea() {
		System.out.println("Área total: ");
	}
}
