package Semana1Modulo02Ex13;

public class TestaPerfilDeSaude {

	public static void main(String[] args) {
		PerfilDeSaude novoPerfil = new PerfilDeSaude("Lucas", "Pires", "Masculino", "28/01/1994", 1.71, 92);

		
		System.out.println("=======Formulário=======");
		System.out.println("Paciente: " + novoPerfil.getNome() + " " + novoPerfil.getSobreNome());
		System.out.println("Sexo: " + novoPerfil.getSexo());
		System.out.println("Data de nascimento: " + novoPerfil.getDataDeNascimento());
		System.out.println("Idade: " + novoPerfil.getIdade());
		System.out.println("Altura: " + novoPerfil.getAltura());
		System.out.println("Peso: " + novoPerfil.getPeso());
		System.out.println("Frequencia Cardiaca: " + novoPerfil.getFrequenciaCardiaca());
		System.out.println("Frequencia Cardiaca alvo máx: " + novoPerfil.getFrequenciaCardiacaAlvoMax());
		System.out.println("Frequencia Cardiaca alvo mín: " + novoPerfil.getFrequenciaCardiacaAlvoMin());
		System.out.printf("IMC: %.2f", novoPerfil.getImc());
		System.out.println("\n====================");
		
	}

}
