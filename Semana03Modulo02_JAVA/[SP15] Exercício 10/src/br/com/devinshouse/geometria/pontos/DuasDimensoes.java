package br.com.devinshouse.geometria.pontos;

public class DuasDimensoes {
	protected double[][] pontoA = new double[1][2];
	protected double[][] pontoB = new double[1][2];
	protected double[][] pontoC = new double[1][2];
	protected double[][] pontoD = new double[1][2];
	
	public DuasDimensoes(){};
	public DuasDimensoes(
			double cordenadaXA, double cordenadaYA,
			double cordenadaXB, double cordenadaYB,
			double cordenadaXC, double cordenadaYC,
			double cordenadaXD, double cordenadaYD) {
		this.pontoA[0][0] = cordenadaXA;
		this.pontoA[0][1] = cordenadaYA;
		this.pontoB[0][0] = cordenadaXB;
		this.pontoB[0][1] = cordenadaYB;
		this.pontoC[0][0] = cordenadaXC;
		this.pontoC[0][1] = cordenadaYC;
		this.pontoD[0][0] = cordenadaXD;
		this.pontoD[0][1] = cordenadaYD;
	}
	
	public void setPontoAX(double cordenada) {
		this.pontoA[0][0] = cordenada; 
	}
	public void setPontoAY(double cordenada) {
		this.pontoA[0][1] = cordenada; 
	}
	public void setPontoBX(double cordenada) {
		this.pontoB[0][0] = cordenada; 
	}
	public void setPontoBY(double cordenada) {
		this.pontoB[0][1] = cordenada; 
	}
	public void setPontoCX(double cordenada) {
		this.pontoC[0][0] = cordenada; 
	}
	public void setPontoCY(double cordenada) {
		this.pontoC[0][1] = cordenada; 
	}
	public void setPontoDX(double cordenada) {
		this.pontoD[0][0] = cordenada; 
	}
	public void setPontoDY(double cordenada) {
		this.pontoD[0][1] = cordenada; 
	}
	
	public double getPontoAX() {
		return pontoA[0][0];
	}
	public double getPontoAY() {
		return pontoA[0][1];
	}
	public String getPontoA() {
		return "(" + this.pontoA[0][0] + "," + this.pontoA[0][1] + ")";
	}
	public double getPontoBX() {
		return pontoB[0][0];
	}
	public double getPontoBY() {
		return pontoB[0][1];
	}
	public String getPontoB() {
		return "(" + this.pontoB[0][0] + "," + this.pontoB[0][1] + ")";
	}
	public double getPontoCX() {
		return pontoC[0][0];
	}
	public double getPontoCY() {
		return pontoC[0][1];
	}
	public String getPontoC() {
		return "(" + this.pontoC[0][0] + "," + this.pontoC[0][1] + ")";
	}
	public double getPontoDX() {
		return pontoD[0][0];
	}
	public double getPontoDY() {
		return pontoD[0][1];
	}
	public String getPontoD() {
		return "(" + this.pontoD[0][0] + "," + this.pontoD[0][1] + ")";
	}
}
