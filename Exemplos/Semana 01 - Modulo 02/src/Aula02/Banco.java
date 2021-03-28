package Aula02;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta destinoConta = new Conta();
		
		minhaConta.nomeDoTitular = "Lucas Pires";
		minhaConta.saldoDoTitular = 100.0;
		
		destinoConta.nomeDoTitular = "Daniel Pires";
		destinoConta.saldoDoTitular = 50.0;
		
		//boolean titularTemSaldo = minhaConta.sacar(2);
		//minhaConta.depositar(50);
		
		
		/*if (titularTemSaldo) {
			System.out.printf("Saque realizado com sucesso, o cliente %s possui R$%.2f de saldo na sua conta atualmente.", minhaConta.nomeDoTitular, saldo);
			
		} else {
			System.out.printf("Sem saldo suficiente, o cliente %s possui R$%.2f de saldo na sua conta atualmente.", minhaConta.nomeDoTitular, saldo);
		}*/
		
		boolean transferenciaDeuCerto = minhaConta.transferir(101, destinoConta);
		double saldoTitular = minhaConta.getSaldoDoTitular();
		double saldoDestino = destinoConta.getSaldoDoTitular();
		
		if (transferenciaDeuCerto) {
			System.out.printf("Transferencia foi realizada com sucesso, o cliente %s possui R$%.2f de saldo na sua conta atualmente. %n", minhaConta.nomeDoTitular, saldoTitular);
			System.out.printf("O cliente %s possui R$%.2f de saldo na sua conta atualmente.", destinoConta.nomeDoTitular, saldoDestino);
		} else {
			System.out.printf("Transferencia não realizada, sem saldo suficiente, o cliente %s possui R$%.2f de saldo na sua conta atualmente.", minhaConta.nomeDoTitular, saldoTitular);
		}
	}

}
