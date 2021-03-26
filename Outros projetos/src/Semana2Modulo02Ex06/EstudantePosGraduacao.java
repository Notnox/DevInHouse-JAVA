package Semana2Modulo02Ex06;

public class EstudantePosGraduacao extends Estudante {
	private String tituloDoEstudante;
	
	public EstudantePosGraduacao(String nome, String sobreNome) {
		super(nome, sobreNome);
	}
	
	public String getTituloDoEstudante() {
		return tituloDoEstudante;
	}

	public void setTituloDoEstudante(String tituloDoEstudante) {
		this.tituloDoEstudante = tituloDoEstudante;
	}
	
	
}
