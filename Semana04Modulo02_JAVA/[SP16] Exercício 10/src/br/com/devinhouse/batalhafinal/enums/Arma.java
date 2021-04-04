package br.com.devinhouse.batalhafinal.enums;

public enum Arma {
	ESPADA(1), MACHADO(2), MARTELO(3), CLAVA(4), 
	ARCO(5), BESTA(6), CAJADO(7), LIVRO_DE_MAGIAS(8), 
	ARMADILHA(9), MACHADO_DUPLO(10);
	
	private int valor;
	
	Arma(int valor){
		this.valor = valor;
	}
	
	public Arma getArma(int valor) {
		switch (valor) {
		case 1:
			return ESPADA;
		case 2:
			return MACHADO;
		case 3:
			return MARTELO;
		case 4:
			return CLAVA;
		case 5:
			return ARCO;
		case 6:
			return BESTA;
		case 7:
			return CAJADO;
		case 8:
			return LIVRO_DE_MAGIAS;
		case 10:
			return MACHADO_DUPLO;

		default:
			return null;
		}
	}
}
