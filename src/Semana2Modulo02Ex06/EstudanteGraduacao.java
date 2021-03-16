package Semana2Modulo02Ex06;

public class EstudanteGraduacao extends Estudante {
	private String nomeclaturaDoEstudante;
	
	public EstudanteGraduacao(String nome, String sobreNome, String nomeclaturaDoEstudante) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.nomeclaturaDoEstudante = nomeclaturaDoEstudante;
	}

	public String getNomeclaturaDoEstudante() {
		return nomeclaturaDoEstudante;
	}

	public void setNomeclaturaDoEstudante(String nomeclaturaDoEstudante) {
		this.nomeclaturaDoEstudante = nomeclaturaDoEstudante;
	}
	
}
