package br.com.devinhouse.excecoes;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		
		System.out.println(calcularRaiz(1,2));;
		System.out.println(calcularRaiz(1,0));;
		
		try {
			System.out.println(throwCalcularRaiz(1, 0));
		} catch (ArithmeticException ae) {
			System.err.println("(C) Throw serve para lan�ar a exce��o para frente!");
		}
	}
	
	
	private static int throwCalcularRaiz(int x, int y) {
		try {
			return x/y;
		} catch (ArithmeticException ae) {
			System.out.println("(D) A referencia sai do escopo.");
			throw new ArithmeticException();
		}
	}
	
	private static int calcularRaiz(int x, int y) {
		try {
			int total = x/y;
			System.out.println("(A) Quando completa o bloco try se n�o houver erro, ele termina no finally, na ausencia do"
					+ " bloco finally, ele apenas sai do try/catch.");
			return total;
		} catch (ArithmeticException ae) {
			System.out.println("(B) Se a exce��o tiver sido tratada, eu lan�o os comandos definidos pelo programador, mas n�o "
					+ "paro a execu��o do programa.");
			System.err.println(ae.getMessage());
			return 0;
		} finally {
			System.out.println("Aqui eu recebo o final do try e do catch!");
		}
	}
}

