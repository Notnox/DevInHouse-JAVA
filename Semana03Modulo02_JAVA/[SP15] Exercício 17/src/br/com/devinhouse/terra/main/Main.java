package br.com.devinhouse.terra.main;

import br.com.devinhouse.terra.poluentes.Carro;
import br.com.devinhouse.terra.poluentes.Moto;
import br.com.devinhouse.terra.poluentes.Poluicao;
import br.com.devinhouse.terra.poluentes.Predio;

public class Main {

	public static void main(String[] args) {
		Carro novoCarro1 = new Carro(1800);
		Carro novoCarro2 = new Carro(120);
		Carro novoCarro3 = new Carro(15000);
		
		Carro[] selecaoCarros = new Carro[3];
		selecaoCarros[0] = novoCarro1;
		selecaoCarros[1] = novoCarro2;
		selecaoCarros[2] = novoCarro3;
		
		Moto novaMoto1 = new Moto(2000);
		Moto novaMoto2 = new Moto(8300);
		Moto novaMoto3 = new Moto(1700);
		
		Moto[] selecaoMotos = new Moto[3];
		selecaoMotos[0] = novaMoto1;
		selecaoMotos[1] = novaMoto2;
		selecaoMotos[2] = novaMoto3;
		
		Predio novoPredio1 = new Predio(640, 60);
		Predio novoPredio2 = new Predio(1020, 30);
		Predio novoPredio3 = new Predio(940, 120);
		
		Predio[] selecaoPredios = new Predio[3];
		selecaoPredios[0] = novoPredio1;
		selecaoPredios[1] = novoPredio2;
		selecaoPredios[2] = novoPredio3;
		
		Poluicao[] poluentes = new Poluicao[4];
		poluentes[0] = new Poluicao();
		poluentes[1] = new Poluicao();
		poluentes[2] = new Poluicao();
		poluentes[3] = new Poluicao();
		
		poluentes[0].getTotalDePoluicao(selecaoPredios);
		poluentes[0].getTotalDePoluicao(selecaoCarros);
		poluentes[0].getTotalDePoluicao(selecaoMotos);
		
		poluentes[1].getTotalDePoluicao(selecaoPredios);
		poluentes[2].getTotalDePoluicao(selecaoCarros);
		poluentes[3].getTotalDePoluicao(selecaoMotos);
		
		System.out.printf("Os prédios possuem um peso de %.2ftco² por mês!%n", poluentes[1].getTotalTco2());
		System.out.printf("Os carros possuem um peso de %.2ftco² por mês!%n", poluentes[2].getTotalTco2());
		System.out.printf("As motos possuem um peso de %.2ftco² por mês!%n", poluentes[3].getTotalTco2());
		System.out.printf("Ao todo temos um peso de %.2ftco² por mês!%n", poluentes[0].getTotalTco2());
		
		
		
	}

}
