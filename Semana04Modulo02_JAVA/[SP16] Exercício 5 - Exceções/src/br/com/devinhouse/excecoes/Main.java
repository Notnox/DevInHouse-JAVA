package br.com.devinhouse.excecoes;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		
		System.out.println(calcularRaiz(1,2));;
		System.out.println(calcularRaiz(1,0));;
		
		try {
			System.out.println(throwCalcularRaiz(1, 0));
		} catch (ArithmeticException ae) {
			System.err.println("(C) Throw serve para lançar a exceção para frente!");
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
			System.out.println("(A) Quando completa o bloco try se não houver erro, ele termina no finally, na ausencia do"
					+ " bloco finally, ele apenas sai do try/catch.");
			return total;
		} catch (ArithmeticException ae) {
			System.out.println("(B) Se a exceção tiver sido tratada, eu lanço os comandos definidos pelo programador, mas não "
					+ "paro a execução do programa.");
			System.err.println(ae.getMessage());
			return 0;
		} finally {
			System.out.println("Aqui eu recebo o final do try e do catch!");
		}
	}
}

