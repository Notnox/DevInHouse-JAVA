package Semana1Modulo02Ex17;

public class TestaContaPoupanca {

	public static void main(String[] args) {
		ContaPoupanca poupador1 = new ContaPoupanca(2000.0);
		ContaPoupanca poupador2 = new ContaPoupanca(3000.0);
		
		System.out.println("=======Extrato de conta=======");
		System.out.printf("Poupador1 saldo: R$%.2f%n", poupador1.getSaldo());
		System.out.printf("Poupador2 saldo: R$%.2f%n", poupador2.getSaldo());
		System.out.println("Juros anual: " + ContaPoupanca.getTaxaDeJurosAnual());
		System.out.println("============================\n");
		ContaPoupanca.alterarTaxaAnual(0.04);
		System.out.println("=======Extrato de conta=======");
		System.out.printf("Poupador1 saldo: R$%.2f%n", poupador1.getSaldo());
		System.out.printf("Poupador2 saldo: R$%.2f%n", poupador2.getSaldo());
		System.out.println("Juros anual: " + ContaPoupanca.getTaxaDeJurosAnual());
		System.out.println("============================\n");
		System.out.println("=======Extrato de conta=======");
		for (int mes = 1; mes < 13; mes++) {
			poupador1.calcularJuroMensal();
			poupador2.calcularJuroMensal();
			System.out.printf("Poupador1 saldo com juros de " + ContaPoupanca.getTaxaDeJurosAnual() + " ao mês " + mes + ": R$%.2f %n", poupador1.getSaldo());
			System.out.printf("Poupador2 saldo com juros de " + ContaPoupanca.getTaxaDeJurosAnual() + " ao mês " + mes + ": R$%.2f %n", poupador2.getSaldo());
		}
		System.out.println("============================\n");
		ContaPoupanca.alterarTaxaAnual(0.05);
		System.out.println("=======Extrato de conta=======");
		System.out.printf("Poupador1 saldo: R$%.2f%n", poupador1.getSaldo());
		System.out.printf("Poupador2 saldo: R$%.2f%n", poupador2.getSaldo());
		System.out.println("Juros anual: " + ContaPoupanca.getTaxaDeJurosAnual());
		System.out.println("============================\n");
		System.out.println("=======Extrato de conta=======");
		for (int mes = 1; mes < 13; mes++) {
			poupador1.calcularJuroMensal();
			poupador2.calcularJuroMensal();
			System.out.printf("Poupador1 saldo com juros de " + ContaPoupanca.getTaxaDeJurosAnual() + " ao mês " + mes + ": R$%.2f %n", poupador1.getSaldo());
			System.out.printf("Poupador2 saldo com juros de " + ContaPoupanca.getTaxaDeJurosAnual() + " ao mês " + mes + ": R$%.2f %n", poupador2.getSaldo());
		}
		System.out.println("============================\n");
	}

}
