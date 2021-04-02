package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.conta.ContaCorrente;
import br.com.devinhouse.banco.seguros.SeguroDeVida;

public class Main {

	public static void main(String[] args) {
		ContaCorrente novaContaCorrente = new ContaCorrente("Lucas", "pires", 200);
		SeguroDeVida novoSeguroDeVida = new SeguroDeVida("Lucas Pires", 500, 421413231);
		
		novaContaCorrente.sacar(100);
		
		System.out.printf("Usúario %s possuí R$%.2f de saldo em sua %s.%nImposto devido: R$%.2f", 
				novaContaCorrente.getNome(), novaContaCorrente.getSaldo(), novaContaCorrente.getTipo(), novaContaCorrente.getValorImposto());
		
		
		System.out.printf("%nO valor cobrado pelo o seguro de vida do usuario %s, é de R$%.2f", 
				novoSeguroDeVida.getTitular(), novoSeguroDeVida.getValorImposto());
		
	}

}
