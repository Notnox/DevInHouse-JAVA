package Aula03;

public class MeuBanco {

	public static void main(String[] args) {
		/*
		int a = 10;
		int b = a;
		b = 20;
		
		System.out.printf("O valor de 'a' é: %d%n", a);
		System.out.printf("O valor de 'b' é: %d", b);
		
		Conta conta1 = new Conta();
		
		conta1.depositar(100);
		Conta conta2 = conta1;
		
		conta2.depositar(200);
		
		System.out.printf("O saldo da conta1 é: R$%.2f %n", conta1.saldoDoTitular);
		System.out.printf("O saldo da conta2 é: R$%.2f", conta2.saldoDoTitular);
		
		Conta conta1 = new Conta();
		conta1.nomeDoTitular = "Lucas Pires";
		conta1.saldoDoTitular = 100;
		
		Conta conta2 = new Conta();
		conta2.nomeDoTitular = "Lucas Pires";
		conta2.saldoDoTitular = 100;
		
		conta1.transferir(25, conta2);
		
		System.out.printf("O saldo da conta1 é: R$%.2f %n", conta1.saldoDoTitular);
		System.out.printf("O saldo da conta2 é: R$%.2f", conta2.saldoDoTitular);
		
		System.out.println(conta1 == conta2);
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta1.equals(conta2));
		
		Conta conta1 = new Conta();
		System.out.println(conta1.saldoDoTitular);
		System.out.println(conta1.nomeDoTitular);
		
		
		//minhaConta.titular = new Cliente();
		//Cliente titular = new Cliente();
		//minhaConta.titular = titular;
		
		Conta minhaConta = new Conta(150);
		
		minhaConta.titular.nome = "Lucas";
		minhaConta.titular.sobreNome = "Pires";
		minhaConta.titular.cpf ="12345678910"; */
		
		Conta minhaConta  = new Conta("Lucas", "Pires", "12345678910", 150);
		
		System.out.print(minhaConta.titular.nome + " - ");
		System.out.print(minhaConta.titular.sobreNome + " - ");
		System.out.print(minhaConta.titular.cpf + " - ");
		System.out.print(minhaConta.saldoDoTitular);
	}

}
