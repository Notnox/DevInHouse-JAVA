package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.bonificacao.CalcularBonificacao;
import br.com.devinhouse.banco.funcionarios.GerenteRegional;

public class Main {

	public static void main(String[] args) {
		GerenteRegional novoGerente = new GerenteRegional("Lucas", "Pires", "12312", 2300, "12312", 2);
		
		System.out.println(CalcularBonificacao.bonificacao(novoGerente));
	}

}
