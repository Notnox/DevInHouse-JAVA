package Semana2Modulo02Ex06;

public class TestaEstudante {

	public static void main(String[] args) {
		EstudanteGraduacao novoAluno = new EstudanteGraduacao("Lucas", "Pires", "Calouro");
		
		System.out.print(novoAluno.getNome() + " - " + novoAluno.getNomeclaturaDoEstudante());
	}

}
