package Semana1Modulo02Ex10;

public class TestaFatura {

	public static void main(String[] args) {
		Fatura novaFatura = new Fatura("0001", "Compra do mercado livre", 15, 5.7);
		
		System.out.println("=======Fatura=======");
		System.out.println("N�mero: " + novaFatura.getNumero());
		System.out.println("Descri��o: " + novaFatura.getDescricao());
		System.out.println("Quantidade: " + novaFatura.getQuantidade());
		System.out.println("Pre�o por unidade: R$" + novaFatura.getPrecoPorItem());
		System.out.println("Total: R$" + novaFatura.getValorFatura());
		System.out.println("====================");
	}

}
