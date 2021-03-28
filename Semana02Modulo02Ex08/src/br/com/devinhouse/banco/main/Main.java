package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.bonificacao.CalcularBonificacao;
import br.com.devinhouse.banco.contas.ContaCorrente;
import br.com.devinhouse.banco.contas.ContaPoupanca;
import br.com.devinhouse.banco.funcionarios.GerenteRegional;

public class Main {

	public static void main(String[] args) {
		 ContaPoupanca novaContaPoupanca = new ContaPoupanca("Xis", "De", 0);
		 
		 novaContaPoupanca.depositar(100);
		 
		 System.out.println(novaContaPoupanca.getSaldo());
		 
		 novaContaPoupanca.renderJurosDePoupanca();
		 
		 System.out.println(novaContaPoupanca.getSaldo());
		
	}

}
