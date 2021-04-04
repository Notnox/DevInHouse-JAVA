package br.com.devinhouse.batalhafinal.enums;

public enum Classe {
	ARQUEIRO(1), GUERREIRO(2), MAGO(3), PALADINO(4);
	
	private int valor;
	
	Classe(int valor){
		this.valor = valor;
	}
	
	public static String getClasse(int valor) {
		switch (valor) {
		case 1:
			return ARQUEIRO.toString();
		case 2:
			return GUERREIRO.toString();	
		case 3:
			return MAGO.toString();
		case 4:
			return PALADINO.toString();
		default:
			return null;
		}
	}
}
