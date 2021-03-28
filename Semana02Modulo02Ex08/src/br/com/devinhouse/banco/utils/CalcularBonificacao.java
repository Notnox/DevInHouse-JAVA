package br.com.devinhouse.banco.utils;

import br.com.devinhouse.banco.funcionarios.Gerente;

public class CalcularBonificacao {

	public static double bonificacao(Gerente gerente) {
		return gerente.calcularBonificacao();
	}
}
