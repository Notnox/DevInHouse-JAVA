package br.com.devinhouse.controledetransito.main;

import br.com.devinhouse.controledetransito.semaforo.Semaforo;

public class Main {

	public static void main(String[] args) {
		System.out.println("(======)");
		System.out.println("|======|");
		System.out.println("|=(  )=| Sinal " + Semaforo.VERMELHO.toString() + " com dura��o de " + Semaforo.VERMELHO.getDuracaoEmSegundo() + " segundos." );
		System.out.println("|======|");
		System.out.println("|=(  )=| Sinal " + Semaforo.AMARELO.toString() + " com dura��o de " + Semaforo.AMARELO.getDuracaoEmSegundo() + " segundos.");
		System.out.println("|======|");
		System.out.println("|=(  )=| Sinal " + Semaforo.VERDE.toString() + " com dura��o de " + Semaforo.VERDE.getDuracaoEmSegundo() + " segundos.");
		System.out.println("|======|");
		System.out.println("(======)");
	}

}
