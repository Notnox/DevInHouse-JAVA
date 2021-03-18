package Semana2Modulo02Ex06;

public class EstudanteGraduacao extends Estudante {
	private String nomeclaturaDoEstudante;
	
	public EstudanteGraduacao(String nome, String sobreNome) {
		super(nome, sobreNome);
	}

	public String getNomeclaturaDoEstudante() {
		return nomeclaturaDoEstudante;
	}

	public void setNomeclaturaDoEstudante(String nomeclaturaDoEstudante) {
		this.nomeclaturaDoEstudante = nomeclaturaDoEstudante;
	}
	
	@Override
	public void cadastroAluno(String curso) {
		super.cadastroAluno(curso);
		System.out.printf("%nO aluno %s é um aluno de graduação!", this.nome);
	}
	
	
}
