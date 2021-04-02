package br.com.devinhouse.terra.poluentes;

import br.com.devinhouse.terra.interfaces.PegadaCarbono;

public class Moto implements PegadaCarbono {
	private double kmComConsumoDeGasolina; //50
	
	public Moto(double kmComConsumoDeGasolina) {
		this.kmComConsumoDeGasolina = kmComConsumoDeGasolina;
	}

	public double getKmComConsumoDeGasolina() {
		return kmComConsumoDeGasolina;
	}

	public void setKmComConsumoDeGasolina(double kmComConsumoDeGasolina) {
		this.kmComConsumoDeGasolina = kmComConsumoDeGasolina;
	}

	@Override
	public double getPegadaCarbono() {
		return this.kmComConsumoDeGasolina/50;
	}
	
	
}
