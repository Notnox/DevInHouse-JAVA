package br.com.devinhouse.terra.poluentes;

import br.com.devinhouse.terra.interfaces.PegadaCarbono;

public class Predio implements PegadaCarbono {
	private double consumoEnergiaEletrica; //200
	private double consumoGasDeCozinha; //500
	
	public Predio(double consumoEnergiaEletrica, double consumoGasDeCozinha) {
		this.consumoEnergiaEletrica = consumoEnergiaEletrica;
		this.consumoGasDeCozinha = consumoGasDeCozinha;
	}

	public double getConsumoEnergiaEletrica() {
		return consumoEnergiaEletrica;
	}

	public void setConsumoEnergiaEletrica(double consumoEnergiaEletrica) {
		this.consumoEnergiaEletrica = consumoEnergiaEletrica;
	}

	public double getConsumoGasDeCozinha() {
		return consumoGasDeCozinha;
	}

	public void setConsumoGasDeCozinha(double consumoGasDeCozinha) {
		this.consumoGasDeCozinha = consumoGasDeCozinha;
	}

	@Override
	public double getPegadaCarbono() {
		return (this.consumoEnergiaEletrica/200) + (this.consumoGasDeCozinha/500);
	}
	
	
}
