package br.com.devinhouse.batalhafinal.enums;

public enum Arma {
	ESPADA(1), MACHADO(2), MARTELO(3), CLAVA(4), 
	ARCO(5), BESTA(6), CAJADO(7), LIVRO_DE_MAGIAS(8), 
	ARMADILHA(9), MACHADO_DUPLO(10);
	
	private int valor;
	
	Arma(int valor){
		this.valor = valor;
	}
	
	public int getDano(Arma arma) {
		if (arma == ESPADA || arma == MACHADO || arma == MARTELO || arma == CLAVA 
				|| arma == ARCO || arma == BESTA || arma == CAJADO || arma == LIVRO_DE_MAGIAS) {
			return 5;
		}
		if (arma == ARMADILHA) {return 2;}
		if (arma == MACHADO_DUPLO) {return 7;}
		return 0;
	}
	
	public String getAtaque(Arma arma) {
		switch (arma) {
		case ESPADA:
			return "com sua espada";
		case MACHADO:
			return "com seu machado";
		case MARTELO:
			return "com seu martelo";
		case CLAVA:
			return "com sua clava";
		case ARCO:
			return "com seu arco e flecha";
		case BESTA:
			return "com sua besta e virote";
		case CAJADO:
			return "com seu cajado, lançando uma bola de fogo";
		case LIVRO_DE_MAGIAS:
			return "absorvendo energia do livro com uma mão e liberando com a outra";
		default:
			return null;
		}
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
