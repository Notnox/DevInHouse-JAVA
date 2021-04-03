package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.agencias.Agencia;
import br.com.devinhouse.banco.conta.ContaCorrente;
import br.com.devinhouse.banco.conta.ContaPoupanca;
import br.com.devinhouse.banco.interfaces.Tributavel;
import br.com.devinhouse.banco.seguros.SeguroDeVida;
import br.com.devinhouse.banco.tributaveis.ManipuladorDeTributaveis;

public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("2334-5");
		
		ContaCorrente cc1 = new ContaCorrente("nome1", "sobrenome1", 100);
		ContaCorrente cc2 = new ContaCorrente("nome2", "sobrenome2", 200);
		ContaCorrente cc3 = new ContaCorrente("nome3", "sobrenome3", 300);
		ContaCorrente cc4 = new ContaCorrente("nome4", "sobrenome4", 400);
		
		ContaPoupanca cp1 = new ContaPoupanca("nome5", "sobrenome5", 500);
		ContaPoupanca cp2 = new ContaPoupanca("nome6", "sobrenome6", 600);
		ContaPoupanca cp3 = new ContaPoupanca("nome7", "sobrenome7", 700);
		ContaPoupanca cp4 = new ContaPoupanca("nome8", "sobrenome8", 800);
		
		agencia.adiciona(cc1);
		agencia.adiciona(cc2);
		agencia.adiciona(cc3);
		agencia.adiciona(cc4);
		agencia.adiciona(cp1);
		agencia.adiciona(cp2);
		agencia.adiciona(cp3);
		agencia.adiciona(cp4);
		
		System.out.printf("A agencia %s possui %d contas cadastradas.", agencia.getNumeroDaAgencia(), agencia.getQuantidadeDeContas());
		
	}

}
