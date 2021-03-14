package Semana1Modulo02Ex11;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario novoFuncionario1 = new Funcionario("Lucas", "Pires", 1000);
		Funcionario novoFuncionario2 = new Funcionario("Roberta", "Kimoto", 2000);
		
		System.out.println("=======Balancete=======");
		System.out.println("Funcionário: " + novoFuncionario1.getNome() + " " + novoFuncionario1.getSobreNome());
		System.out.println("Salário mensal: R$" + novoFuncionario1.getSalarioMensal());
		System.out.println("Salário anual: R$" + novoFuncionario1.getCalculoSalarial(12));
		System.out.println("====================");
		System.out.println("Funcionário: " + novoFuncionario2.getNome() + " " + novoFuncionario2.getSobreNome());
		System.out.println("Salário mensal: R$" + novoFuncionario2.getSalarioMensal());
		System.out.println("Salário anual: R$" + novoFuncionario2.getCalculoSalarial(12));
		System.out.println("====================\n");
		
		System.out.println("Aumento de 33% para todos os funcionários que cumpriram as metas!\n");
		
		System.out.println("=======Balancete=======");
		System.out.println("Funcionário: " + novoFuncionario1.getNome() + " " + novoFuncionario1.getSobreNome());
		System.out.println("Salário mensal: R$" + novoFuncionario1.getSalarioMensal());
		System.out.println("Salário anual: R$" + novoFuncionario1.getCalculoSalarial(12));
		System.out.println("====================");
		System.out.println("Funcionário: " + novoFuncionario2.getNome() + " " + novoFuncionario2.getSobreNome());
		novoFuncionario2.getAumentoSalarial(33);
		System.out.println("Salário mensal: R$" + novoFuncionario2.getSalarioMensal());
		System.out.println("Salário anual: R$" + novoFuncionario2.getCalculoSalarial(12));
		System.out.println("====================\n");
	}

}
