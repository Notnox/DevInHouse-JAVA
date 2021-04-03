package br.com.devinhouse.controledetransito.semaforo;

public enum Semaforo {
	VERMELHO(30), VERDE(20), AMARELO(5);
	
	private int duracaoEmSegundos;
	
	private Semaforo(int duracao) {
		this.duracaoEmSegundos = duracao;
	}
	
	public int getDuracaoEmSegundo() {
		return this.duracaoEmSegundos;
	}
}
