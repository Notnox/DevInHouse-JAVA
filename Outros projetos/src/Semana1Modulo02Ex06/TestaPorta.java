package Semana1Modulo02Ex06;

public class TestaPorta {

	public static void main(String[] args) {
		Porta novaPorta = new Porta("Branca", 0.80, 2.15, 0.30);
		System.out.println("=======NOVA PORTA=======");
		System.out.println("Cor: " + novaPorta.getCor());
		System.out.println("Largura: " + novaPorta.getLargura());
		System.out.println("Altura: " + novaPorta.getAltura());
		System.out.println("Profundidade: " + novaPorta.getProfundidade());
		System.out.println("A porta está fechada");
		System.out.println("=========================\n");
		
		System.out.println("=======PORTA=============");
		novaPorta.pintarPorta("Marrom");
		System.out.println("Cor: " + novaPorta.getCor());
		novaPorta.setLargura(15);
		System.out.println("Largura: " + novaPorta.getLargura());
		novaPorta.setAltura(20);
		System.out.println("Altura: " + novaPorta.getAltura());
		novaPorta.setProfundidade(5);
		System.out.println("Profundidade: " + novaPorta.getProfundidade());
		for (int vezes = 0; vezes < 9; vezes++) {
			novaPorta.interagirComPorta();
		}
		if (novaPorta.verificarPorta()) {
			System.out.println("A porta está aberta");
		} else {
			System.out.println("A porta está fechada");
		}
		System.out.println("=========================");
	}

}
