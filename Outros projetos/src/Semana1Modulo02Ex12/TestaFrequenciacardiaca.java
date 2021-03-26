package Semana1Modulo02Ex12;

public class TestaFrequenciacardiaca {

	public static void main(String[] args) {
		FrequenciaCardiaca atleta = new FrequenciaCardiaca("Lucas", "Pires", "28/01/1994");
		int frequanciaCardiaca = atleta.getFrequenciaCardiaca(atleta.getIdade());
		
		System.out.println("=======Frequencia cardiaca=======");
		System.out.println("Atleta: " + atleta.getNome() + " " + atleta.getSobreNome());
		System.out.println("Data de nascimento: " + atleta.getDataDeNascimento());
		System.out.println("Idade: " + atleta.getIdade());
		System.out.println("Frequencia Cardiaca: " + frequanciaCardiaca);
		System.out.println("Frequencia Cardiaca alvo: " + atleta.getFrequenciaCardiacaAlvo(frequanciaCardiaca));
		System.out.println("====================");
	}


}
