package Semana1Modulo02Ex14;

public class TestaRetangulo {

	public static void main(String[] args) {
		Retangulo novoRetangulo = new Retangulo();
		
		System.out.printf("A �rea dessa figura �: " + novoRetangulo.getComprimento() +
				" * " + novoRetangulo.getLargura() + " = %.2f m� %n", novoRetangulo.calculaArea());
		
		novoRetangulo.setComprimento(5);
		novoRetangulo.setComprimento(-20);
		novoRetangulo.setComprimento(22);
		novoRetangulo.setLargura(-20);
		novoRetangulo.setLargura(22);
		novoRetangulo.setLargura(7);
		
		System.out.printf("A �rea dessa figura �: " + novoRetangulo.getComprimento() +
				" * " + novoRetangulo.getLargura() + " = %.2f m�", novoRetangulo.calculaArea());
	}

}
