package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.bonificacao.CalcularBonificacao;
import br.com.devinhouse.banco.contas.ContaCorrente;
import br.com.devinhouse.banco.funcionarios.GerenteRegional;

public class Main {

	public static void main(String[] args) {
		GerenteRegional novoGerente = new GerenteRegional("Lucas", "Pires", "12312", 2300, "12312", 2);
		
		System.out.println(CalcularBonificacao.bonificacao(novoGerente));
		
		ContaCorrente novaContaCorrente = new ContaCorrente("lulu", "pipi", 0);
		
		novaContaCorrente.depositar(1000);
		
		novaContaCorrente.sacar(100);
		
		System.out.println(novaContaCorrente.getSaldo());
	}

}
