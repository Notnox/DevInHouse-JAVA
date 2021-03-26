package Semana1Modulo02Ex05;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa usuario = new Pessoa("Lucas");
		
		System.out.println("A pessoa: " + usuario.getNome() + " possui " + usuario.getIdade() + " ano.");
		usuario.fazAniversario();
		System.out.print("A pessoa: " + usuario.getNome() + " possui " + usuario.getIdade() + " ano.");
	}

}
