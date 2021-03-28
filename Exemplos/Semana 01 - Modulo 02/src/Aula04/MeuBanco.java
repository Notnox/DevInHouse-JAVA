package Aula04;

public class MeuBanco {

	public static void main(String[] args) {

		Conta minhaConta  = new Conta("Lucas", "Pires", "12345678910", 0);
		
		minhaConta.sacar(10);
		
		System.out.print(minhaConta.getTitular("nome") + " - ");
		System.out.print(minhaConta.getTitular("sobreNome") + " - ");
		System.out.print(minhaConta.getTitular("cpf") + " - ");
		System.out.print(minhaConta.getSaldo());
		System.out.print(Conta.getTotalDeContas());
	}

}
