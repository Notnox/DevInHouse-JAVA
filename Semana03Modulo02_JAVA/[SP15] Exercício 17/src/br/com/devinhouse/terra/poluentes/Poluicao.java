package br.com.devinhouse.terra.poluentes;

import br.com.devinhouse.terra.interfaces.PegadaCarbono;

public class Poluicao {
	private double totalTco2;
	
	public Poluicao() {}
	
	public double getTotalTco2() {
		return totalTco2;
	}

	public void getTotalDePoluicao(PegadaCarbono[] poluentes) {
		for (PegadaCarbono poluente : poluentes) {
			this.totalTco2 += poluente.getPegadaCarbono();
		}
	}
}
