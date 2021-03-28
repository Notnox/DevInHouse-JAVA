package Aula01e02;

public class MeuBanco {

	public static void main(String[] args) {
/*
		Conta minhaConta  = new Conta("Lucas", "Pires", "12345678910", 0);
		ContaCorrente minhaContaCorrente = new ContaCorrente();
		
		minhaConta.sacar(10);
		
		System.out.print(minhaConta.getTitular("nome") + " - ");
		System.out.print(minhaConta.getTitular("sobreNome") + " - ");
		System.out.print(minhaConta.getTitular("cpf") + " - ");
		System.out.print(minhaConta.getSaldo());
		System.out.print(Conta.getTotalDeContas());
		
		minhaContaCorrente.depositar(200);
		
		System.out.println(minhaContaCorrente.getSaldo());
		
		
		Conta minhaConta  = new Conta();
		ContaCorrente minhaContaCorrente = new ContaCorrente();
		ContaCorrente minhaContaPoupanca = new ContaCorrente();
		
		minhaContaCorrente.depositar(200);
		minhaContaPoupanca.depositar(300);
		minhaContaCorrente.setLimite(300);
		
		
		System.out.println(minhaContaCorrente.getSaldo());
		System.out.println(minhaContaPoupanca.getSaldo());
		
		ContaCorrente novoConta = new ContaCorrente("Lucas", "Pires", "12345678910",50,100);
		Conta minhaConta  = new Conta("Lucas", "Pires", "12345678910", 1500);
		
		System.out.print(minhaConta);
		
		//System.out.print(novoConta.getSaldo());
		
		//novoConta.imprimeSaldo();
		
		Endereco novoEndereco = new Endereco("Rua", "123", "ap01", "9988282");
		Endereco novoEndereco2 = new Endereco("Rua", "123", "ap01", "9988282");
		
		System.out.print(novoEndereco.equals(novoEndereco2));
		
		Conta minhaConta  = new Conta("Lucas", "Pires", "12345678910", 233);
		
		Conta c2 = (Conta) minhaConta.clone();
		
		System.out.print(c2);
		
		ContaCorrente novaContaCorrente = new ContaCorrente("Lucas", "Pires", "265455", 2000, 100);
		
	    Conta conta = novaContaCorrente;
		
	
		System.out.println(conta.getSaldo());
		
		conta.depositar(130);
		
		System.out.println(novaContaCorrente.getSaldo());
		
		System.out.println(conta);
		System.out.println(novaContaCorrente);*/
		
		ContaCorrente novaContaCorrente = new ContaCorrente("Lucas", "Pires", "265455", 2000, 100);
		ContaCorrente novaContaCorrente2 = new ContaCorrente("carlos", "antunes", "321321", 4517, 2888);
		
		novaContaCorrente.depositar(20000);
		
		novaContaCorrente.transferir(16780, novaContaCorrente2);
		
		System.out.println(novaContaCorrente.getSaldo());
		System.out.println(novaContaCorrente2.getSaldo());
	}

}
