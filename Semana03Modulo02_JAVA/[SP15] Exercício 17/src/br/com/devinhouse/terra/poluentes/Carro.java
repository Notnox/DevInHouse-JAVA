package br.com.devinhouse.terra.poluentes;

import br.com.devinhouse.terra.interfaces.PegadaCarbono;

public class Carro implements PegadaCarbono {
	private double kmComConsumoDeAlcool; //125
	
	public Carro(double kmComConsumoDeAlcool) {
		this.kmComConsumoDeAlcool = kmComConsumoDeAlcool;
	}

	public double getKmComConsumoDeAlcool() {
		return kmComConsumoDeAlcool;
	}

	public void setKmComConsumoDeAlcool(double kmComConsumoDeAlcool) {
		this.kmComConsumoDeAlcool = kmComConsumoDeAlcool;
	}

	@Override
	public double getPegadaCarbono() {
		return this.kmComConsumoDeAlcool/125;
	}
	
}
