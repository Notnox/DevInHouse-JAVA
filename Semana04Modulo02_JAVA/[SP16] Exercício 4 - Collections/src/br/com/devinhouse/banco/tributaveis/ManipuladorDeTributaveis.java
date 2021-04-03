package br.com.devinhouse.banco.tributaveis;

import br.com.devinhouse.banco.interfaces.Tributavel;

public class ManipuladorDeTributaveis {
	private double total;
	
	public ManipuladorDeTributaveis() {}
	
	public double getTotal() {
		return this.total;
	}
	
	public void calculaImpostos(Tributavel[] tributaveis) {
		for (Tributavel tributavel : tributaveis) {
			this.total += tributavel.getValorImposto();
		}
	}
}
