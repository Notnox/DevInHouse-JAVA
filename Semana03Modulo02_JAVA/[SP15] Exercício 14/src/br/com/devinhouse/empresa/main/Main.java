package br.com.devinhouse.empresa.main;

import br.com.devinhouse.empresa.folhadepagamento.Funcionario;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioAssalariado;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioComissionado;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioHorista;
import br.com.devinhouse.empresa.folhadepagamento.FuncionarioPorPeca;

public class Main {

	public static void main(String[] args) {
		FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("João", "Mendes", 15000, 1, 4, 1987);
		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Bruno", "Ferronato", .75, 6000, 1, 4, 1950);
		FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Brayan", "Moncks", 1500, 4, 19, 4, 1976);
		FuncionarioPorPeca funcionarioPorPeca = new FuncionarioPorPeca("Antonio", "Nunes", 27, 4, 1988, 325, 17.5);
		
		Funcionario arrayFuncionarios[] = new Funcionario[Funcionario.getTotalDeFuncionarios()];
		
		arrayFuncionarios[0] = funcionarioAssalariado;
		arrayFuncionarios[1] = funcionarioComissionado;
		arrayFuncionarios[2] = funcionarioHorista;
		arrayFuncionarios[3] = funcionarioPorPeca;
		
		double valorFolha = 0;
		
		for(Funcionario func: arrayFuncionarios) {
			System.out.println(func);
			valorFolha += func.calcularSalarioMensal();
		}
		System.out.println("Folha de pagamento: R$" + valorFolha);
	}

}
