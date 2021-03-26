package Semana1Modulo02Ex16;

import java.text.ParseException;

public class TestaPessoa {

	public static void main(String[] args){
		Pessoa novaPessoa = new Pessoa("Lucas Pires", "12345678910");

		boolean cpf = novaPessoa.validaCPF(novaPessoa.getCpf());
		if (cpf) {
			System.out.print("Nome: " + novaPessoa.getNome() + " - CPF: " + novaPessoa.getCpf());
		} else {
			System.out.print("CPF invalido!");
		}
	}

}
