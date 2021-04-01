package br.com.devinshouse.geometria.pontos;

public class TresDimensoes {
	private double[][][] pontoA = new double[2][2][2];
	private double[][][] pontoB = new double[2][2][2];
	private double[][][] pontoC = new double[2][2][2];
	private double[][][] pontoD = new double[2][2][2];
	private double[][][] pontoE = new double[2][2][2];
	private double[][][] pontoF = new double[2][2][2];
	private double[][][] pontoG = new double[2][2][2];
	private double[][][] pontoH = new double[2][2][2];
	
	public TresDimensoes(){};
	public TresDimensoes(
			double cordenadaXA, double cordenadaYA, double cordenadaZA,
			double cordenadaXB, double cordenadaYB, double cordenadaZB,
			double cordenadaXC, double cordenadaYC, double cordenadaZC,
			double cordenadaXD, double cordenadaYD, double cordenadaZD,
			double cordenadaXE, double cordenadaYE, double cordenadaZE,
			double cordenadaXF, double cordenadaYF, double cordenadaZF,
			double cordenadaXG, double cordenadaYG, double cordenadaZG,
			double cordenadaXH, double cordenadaYH, double cordenadaZH) {
		this.pontoA[1][0][0] = cordenadaXA;
		this.pontoA[0][1][0] = cordenadaYA;
		this.pontoA[0][0][1] = cordenadaZA;
		this.pontoB[1][0][0] = cordenadaXB;
		this.pontoB[0][1][0] = cordenadaYB;
		this.pontoB[0][0][1] = cordenadaZB;
		this.pontoC[1][0][0] = cordenadaXC;
		this.pontoC[0][1][0] = cordenadaYC;
		this.pontoC[0][0][1] = cordenadaZC;
		this.pontoD[1][0][0] = cordenadaXD;
		this.pontoD[0][1][0] = cordenadaYD;
		this.pontoD[0][0][1] = cordenadaZD;
		this.pontoE[1][0][0] = cordenadaXE;
		this.pontoE[0][1][0] = cordenadaYE;
		this.pontoE[0][0][1] = cordenadaZE;
		this.pontoF[1][0][0] = cordenadaXF;
		this.pontoF[0][1][0] = cordenadaYF;
		this.pontoF[0][0][1] = cordenadaZF;
		this.pontoG[1][0][0] = cordenadaXG;
		this.pontoG[0][1][0] = cordenadaYG;
		this.pontoG[0][0][1] = cordenadaZG;
		this.pontoH[1][0][0] = cordenadaXH;
		this.pontoH[0][1][0] = cordenadaYH;
		this.pontoH[0][0][1] = cordenadaZH;

	}
	
	public void setPontoAX(double cordenada) {
		this.pontoA[1][0][0] = cordenada; 
	}
	public void setPontoAY(double cordenada) {
		this.pontoA[0][1][0] = cordenada; 
	}
	public void setPontoAZ(double cordenada) {
		this.pontoA[0][0][1] = cordenada; 
	}
	public void setPontoBX(double cordenada) {
		this.pontoB[1][0][0] = cordenada; 
	}
	public void setPontoBY(double cordenada) {
		this.pontoB[0][1][0] = cordenada; 
	}
	public void setPontoBZ(double cordenada) {
		this.pontoB[0][0][1] = cordenada; 
	}
	public void setPontoCX(double cordenada) {
		this.pontoC[1][0][0] = cordenada; 
	}
	public void setPontoCY(double cordenada) {
		this.pontoC[0][1][0] = cordenada; 
	}
	public void setPontoCZ(double cordenada) {
		this.pontoC[0][0][1] = cordenada; 
	}
	public void setPontoDX(double cordenada) {
		this.pontoD[1][0][0] = cordenada; 
	}
	public void setPontoDY(double cordenada) {
		this.pontoD[0][1][0] = cordenada; 
	}
	public void setPontoDZ(double cordenada) {
		this.pontoD[0][0][1] = cordenada; 
	}
	public void setPontoEX(double cordenada) {
		this.pontoE[1][0][0] = cordenada; 
	}
	public void setPontoEY(double cordenada) {
		this.pontoE[0][1][0] = cordenada; 
	}
	public void setPontoEZ(double cordenada) {
		this.pontoE[0][0][1] = cordenada; 
	}
	public void setPontoFX(double cordenada) {
		this.pontoF[1][0][0] = cordenada; 
	}
	public void setPontoFY(double cordenada) {
		this.pontoF[0][1][0] = cordenada; 
	}
	public void setPontoFZ(double cordenada) {
		this.pontoF[0][0][1] = cordenada; 
	}
	public void setPontoGX(double cordenada) {
		this.pontoG[1][0][0] = cordenada; 
	}
	public void setPontoGY(double cordenada) {
		this.pontoG[0][1][0] = cordenada; 
	}
	public void setPontoGZ(double cordenada) {
		this.pontoG[0][0][1] = cordenada; 
	}
	public void setPontoHX(double cordenada) {
		this.pontoH[1][0][0] = cordenada; 
	}
	public void setPontoHY(double cordenada) {
		this.pontoH[0][1][0] = cordenada; 
	}
	public void setPontoHZ(double cordenada) {
		this.pontoH[0][0][1] = cordenada; 
	}
	
	public double getPontoAX() {
		return this.pontoA[1][0][0];
	}
	public double getPontoAY() {
		return this.pontoA[0][1][0];
	}
	public double getPontoAZ() {
		return this.pontoA[0][0][1];
	}
	public String getPontoA() {
		return "(" + this.pontoA[1][0][0] + "," + this.pontoA[0][1][0] + "," + this.pontoA[0][0][1] + ")";
	}
	public double getPontoBX() {
		return this.pontoB[1][0][0];
	}
	public double getPontoBY() {
		return this.pontoB[0][1][0];
	}
	public double getPontoBZ() {
		return this.pontoB[0][0][1];
	}
	public String getPontoB() {
		return "(" + this.pontoB[1][0][0] + "," + this.pontoB[0][1][0] + "," + this.pontoB[0][0][1] + ")";
	}
	public double getPontoCX() {
		return this.pontoC[1][0][0];
	}
	public double getPontoCY() {
		return this.pontoC[0][1][0];
	}
	public double getPontoCZ() {
		return this.pontoC[0][0][1];
	}
	public String getPontoC() {
		return "(" + this.pontoC[1][0][0] + "," + this.pontoC[0][1][0] + "," + this.pontoC[0][0][1] + ")";
	}
	public double getPontoDX() {
		return this.pontoD[1][0][0];
	}
	public double getPontoDY() {
		return this.pontoD[0][1][0];
	}
	public double getPontoDZ() {
		return this.pontoD[0][0][1];
	}
	public String getPontoD() {
		return "(" + this.pontoD[1][0][0] + "," + this.pontoD[0][1][0] + "," + this.pontoD[0][0][1] + ")";
	}
	public double getPontoEX() {
		return this.pontoE[1][0][0];
	}
	public double getPontoEY() {
		return this.pontoE[0][1][0];
	}
	public double getPontoEZ() {
		return this.pontoE[0][0][1];
	}
	public String getPontoE() {
		return "(" + this.pontoE[1][0][0] + "," + this.pontoE[0][1][0] + "," + this.pontoE[0][0][1] + ")";
	}
	public double getPontoFX() {
		return this.pontoF[1][0][0];
	}
	public double getPontoFY() {
		return this.pontoF[0][1][0];
	}
	public double getPontoFZ() {
		return this.pontoF[0][0][1];
	}
	public String getPontoF() {
		return "(" + this.pontoF[1][0][0] + "," + this.pontoF[0][1][0] + "," + this.pontoF[0][0][1] + ")";
	}
	public double getPontoGX() {
		return this.pontoG[1][0][0];
	}
	public double getPontoGY() {
		return this.pontoG[0][1][0];
	}
	public double getPontoGZ() {
		return this.pontoG[0][0][1];
	}
	public String getPontoG() {
		return "(" + this.pontoG[1][0][0] + "," + this.pontoG[0][1][0] + "," + this.pontoG[0][0][1] + ")";
	}
	public double getPontoHX() {
		return this.pontoH[1][0][0];
	}
	public double getPontoHY() {
		return this.pontoH[0][1][0];
	}
	public double getPontoHZ() {
		return this.pontoH[0][0][1];
	}
	public String getPontoH() {
		return "(" + this.pontoH[1][0][0] + "," + this.pontoH[0][1][0] + "," + this.pontoH[0][0][1] + ")";
	}

}
