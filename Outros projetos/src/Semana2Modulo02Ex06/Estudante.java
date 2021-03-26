package Semana2Modulo02Ex06;

public class Estudante {
	protected String nome;
	protected String sobreNome;
	protected String dataDeNascimento;
	protected String turma;
	protected String cursoMatriculado;
	protected int idade;
	protected int matricula;
	
	public Estudante (String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getCursoMatriculado() {
		return cursoMatriculado;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void cadastroAluno(String curso) {
		this.cursoMatriculado = curso;
		System.out.printf("O aluno %s foi registrado no curso %s!", this.nome, curso);
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n %s", "Aluno", this.nome, this.sobreNome, "Data de nacsimento", this.dataDeNascimento);
	}
}
