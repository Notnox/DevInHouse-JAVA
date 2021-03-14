package Semana1Modulo02Ex07;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria novaConta = new ContaBancaria("Lucas Pires", 1001, 15);
		
		System.out.println("=======Extrato de conta=======");
		System.out.println("Nome: " + novaConta.getNomeDoTitular());
		System.out.println("Conta: " + novaConta.getNumeroDaConta());
		System.out.println("Agência: " + novaConta.getAgenciaDaConta());
		System.out.println("Saldo: R$" + novaConta.consultaDeSaldo());
		System.out.println("Cheque especial: R$" + novaConta.consultaDeLimite());
		System.out.println("============================\n");
		
		novaConta.depositar(1000000);
		
		if (novaConta.sacar(1000200)) {
			System.out.println("Saque realizado com sucesso!\n");
		} else {
			System.out.println("Sem saldo para realizar o saque!\n");
		}
		
		System.out.println("=======Extrato de conta=======");
		System.out.println("Nome: " + novaConta.getNomeDoTitular());
		System.out.println("Conta: " + novaConta.getNumeroDaConta());
		System.out.println("Agência: " + novaConta.getAgenciaDaConta());
		System.out.println("Saldo: R$" + novaConta.consultaDeSaldo());
		System.out.println("Cheque especial: R$" + novaConta.consultaDeLimite());
		System.out.println("============================\n");
	}

}
