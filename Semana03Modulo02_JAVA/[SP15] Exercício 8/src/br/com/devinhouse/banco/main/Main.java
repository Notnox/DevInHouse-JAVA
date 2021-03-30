package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.conta.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		ContaCorrente novaContaCorrente = new ContaCorrente("Lucas", "pires", 200);
		
		novaContaCorrente.sacar(100);
		
		System.out.printf("Usúario %s possuí em sua conta R$%.2f de saldo em sua %s.%n", 
				novaContaCorrente.getNome(), novaContaCorrente.getSaldo(), novaContaCorrente.getTipo());
		
		novaContaCorrente.depositar(350);
		
		System.out.printf("Usúario %s possuí em sua conta R$%.2f de saldo em sua %s.%n", 
				novaContaCorrente.getNome(), novaContaCorrente.getSaldo(), novaContaCorrente.getTipo());
		
	}

}
