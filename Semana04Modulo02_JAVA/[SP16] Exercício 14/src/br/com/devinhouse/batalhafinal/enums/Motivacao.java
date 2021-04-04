package br.com.devinhouse.batalhafinal.enums;

public enum Motivacao {
	
	VINGANCA(1), GLORIA(2);
	
	private int valor;
	
	Motivacao(int valor){
		this.valor = valor;
	}
	
	public static Motivacao getMotivacao(int valor) {
		if (valor == 1) {
			return VINGANCA;
		} else {
			return GLORIA;
		}
	}
}
