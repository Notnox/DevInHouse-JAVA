package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.contas.Conta;
import br.com.devinhouse.banco.contas.ContaCorrente;
import br.com.devinhouse.banco.contas.ContaPoupanca;
import br.com.devinhouse.banco.funcionarios.GerenteRegional;
import br.com.devinhouse.banco.utils.CalcularBonificacao;
import br.com.devinhouse.banco.utils.TipoConta;

public class Main {

	public static void main(String[] args) {
		 ContaPoupanca novaContaPoupanca = new ContaPoupanca("Xis", "De", 0);
		 
		 TipoConta.getTipo(novaContaPoupanca);
		
	}

}
