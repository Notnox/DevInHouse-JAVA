package br.com.devinhouse.empresa.main;

import br.com.devinhouse.empresa.folhadepagamento.Funcionario;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioAssalariado;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioComissionado;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioHorista;

public class Main {

	public static void main(String[] args) {
		FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("João", "Mendes", 15000, 1, 4, 1987);
		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Bruno", "Ferronato", .75, 6000, 1, 4, 1950);
		FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Brayan", "Moncks", 1500, 4, 19, 4, 1976);
		
		Funcionario arrayFuncionarios[] = new Funcionario[Funcionario.getTotalDeFuncionarios()];
		
		arrayFuncionarios[0] = funcionarioAssalariado;
		arrayFuncionarios[1] = funcionarioComissionado;
		arrayFuncionarios[2] = funcionarioHorista;
		
		double valorFolha = 0;
		
		for(Funcionario func: arrayFuncionarios) {
			System.out.println(func);
			valorFolha += func.calcularSalarioMensal();
		}
		System.out.println("Folha de pagamento: R$" + valorFolha);
	}

}
