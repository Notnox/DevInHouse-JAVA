package Semana1Modulo02Ex09;

public class TestaData {

	public static void main(String[] args) {
		Data novaData = new Data(14,3,2021);
		
		if (novaData.getDataValida()) {
			System.out.println("Data valida!: " + novaData.exibirData());
		} else {
			System.out.println("Data invalida!");
		}
	}

}
