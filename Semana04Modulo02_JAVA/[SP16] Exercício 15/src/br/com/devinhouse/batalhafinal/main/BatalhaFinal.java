package br.com.devinhouse.batalhafinal.main;

import br.com.devinhouse.batalhafinal.classes.Alquimista;
import br.com.devinhouse.batalhafinal.classes.Armeiro;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.personagens.Armadilha;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo(a) ��BATALHA FINAL!");

		Jogador player1 = EntradaScanner.EntradaDeClasse();
		
		System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo,\n"
				+ "e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o.\n"
				+ "Voc� olha para o portal �sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
		
		System.out.println("Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente.\n"
				+ "Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno.\n"
				+ "Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas.\n"
				+ "Voc� est� a um passo de encerrar para sempre esse mal.");
		
		System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
		
		EntradaScanner.entradaDaMotivacao(player1);
		
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Imagens daquela noite tr�gica invadem sua mente.\n"
				+ "Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes,\n"
				+ "mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram.\n"
				+ "Elas s�o o combust�-vel que te fizeram chegar at� aqui.\n"
				+ "E voc� sabe que n�o ir� desistir at� ter vingado a morte\n"
				+ "daqueles que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo.\n"
				+ "O maldito l�der finalmente pagar� por tanto mal causado na vida de tantos\n"
				+ "(e principalmente na sua).");
		} else {
			System.out.println("Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os abertos,\n"
				+ "bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e diversas riquezas,\n"
				+ "taberneiros se recusando a cobrar por suas bebedeiras e comilan�as.\n"
				+ "Desde j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas,\n"
				+ "depois de destruir o vil�o que tanto assombrou a paz de todos.\n"
				+ "Por�m, voc� sabe que ainda falta o �ltimo ato dessa hist�ria.\n"
				+ "Voc� se concentra na miss�o.\n"
				+ "A gl�ria o aguarda, mas n�o antes da �ltima batalha.");
		}
		
		System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas,\n"
				+ "suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado.\n"
				+ "Voc� avan�a pelo portal.");
		
		System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal por suas costas.\n"
				+ "� sua frente, � poss�vel perceber que voc� se encontra em um corredor extenso.\n"
				+ "Voc� pode ir para frente, ou desistir.");
		
		if (EntradaScanner.EntradaParaDesistir()) {
			System.out.println("O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\n"
					+ "Voc� se volta para a noite l� fora, e corre em dire��o � seguran�a.");
			System.exit(0);
		}
		
		System.out.println("Voc� caminha, atento a todos os seus sentidos, por v�rios metros,\n"
					+ "at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha,\n"
					+ "vindo de dentro de uma porta aberta.");
		
		System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
				+ "e pondera sobre como passar pela porta.");
		int movimentacao = EntradaScanner.EntradaParaMovimentacao();
		if (movimentacao == 3) {
			System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
		} else if (movimentacao == 2) {
			System.out.println("Voc� respira fundo e desata a correr em dire��o � sala.\n"
					+ "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
					+ "mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura de inimigos.\n"
					+ "N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�,\n"
					+ "e quando se vira, v� v�rias flechas no ch�o.\n"
					+ "Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
					+ "mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");
		} else {
			System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz.\n"
					+ "Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta.\n"
					+ "Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor.\n"
					+ "Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna.");
			Armadilha armadilhaDeFlechas = new Armadilha();
			System.err.println(armadilhaDeFlechas.atacar(player1));
		}
		System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
				+ "Uma delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas.\n"
				+ "A porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler,\n"
				+ "mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo.\n"
				+ "Voc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras douradas,\n"
				+ "e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais,\n"
				+ "antes de conseguir enfrentar o l�der.");
		
		System.out.println("Voc� se dirige para a porta � direita.");
		
		System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada.\n"
				+ "Segura com mais for�aa sua arma com uma m�o, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, voc� se depara com uma sala espa�osa,\n"
				+ "com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas.\n"
				+ "Voc� imagina que este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados\n"
				+ "utilizam quando saem para espalhar o terror nas cidades e vilas da regi�o.\n"
				+ "Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s.\n"
				+ "Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo.\n"
				+ "Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate.\n"
				+ "Ele avan�a em sua dire��o.");
		Armeiro capitaoArmeiro = new Armeiro(0, 0, 0, null);
		// TODO: iniciar loop de combate, inimigo ataca primeiro
		
		System.out.println("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados.\n"
				+ "Olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
		
		if (EntradaScanner.EntradaParaRenovacao()) {
			System.out.println("Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas,\n"
					+ "que estavam danificadas, pelas pe�as de armaduras existentes na sala.\n"
					+ "De armadura nova, voc� se sente mais protegido para os desafios � sua frente.");
			player1.receberArmadura(5);
		} else {
			System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
		}
		
		System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta "
				+ "do l�der inimigo.\n"
				+ "Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
		
		System.out.println("Voc� retorna � sala anterior e se dirige � porta da esquerda.\n"
				+ "Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada.\n"
				+ "Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, voc� se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
				+ "existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas,\n"
				+ "e voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes,\n"
				+ "criando po��es utilizadas pelos soldados para aterrorizar a regi�o.");
		System.out.println("No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo.\n"
				+ "Um orque horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.");
		Alquimista capitaoAlquimista = new Alquimista(0, 0, 0, null);
		// TODO: iniciar loop de combate, inimigo ataca primeiro
		
		System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo.\n"
				+ "Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado,\n"
				+ "pega a garrafa e pondera se deve beber um gole.");
		if (EntradaScanner.EntradaParaPocao()) {
			System.out.println("Voc� se sente revigorado para seguir adiante!");
			player1.receberVidaMaxima();
		} else {
			System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");
		}
		
		System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa,\n"
				+ "e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo.\n"
				+ "Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		
		System.out.println("De volta � sala das portas, voc� se dirige � porta final.\n"
				+ "Coloca as chaves nas fechaduras, e a porta se abre.\n"
				+ "Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente,\n"
				+ "e voc� percebe que est� muito pr�ximo do seu objetivo final.\n"
				+ "Segura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta.");
		
		System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, "
				+ "e prisioneiros acorrentados � paredes.");
		
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");
		
		if (EntradaScanner.EntradaParaAtacar()) {}
		// TODO: iniciar loop de combate, dependendo da resposta do jogador, ele ataca primeiro
		
		System.out.println("Voc� conseguiu!");
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma "
					+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. "
					+ "Agora voc� pode seguir sua vida.");
		} else {
			System.out.println("O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se "
					+ "ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.");
		}
		
		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
				+ "e todos voc�s saem em dire��o � noite, retornando � cidade.\n"
				+ "Seu dever est� cumprido.");
	}
	
	private void combate(/* parâmetros */) {		
		/*
		Num combate, cada adversário possui um turno. Quem toma a iniciativa do início do combate possui a vantagem do primeiro turno. O inimigo sempre atacará, e o jogador pode escolher entre atacar e fugir (encerrando o jogo).
		
		Cada ataque leva em consideração os pontos de ataque do personagem + ataque da arma + “rolamento de dado�? (valor entre 1-20) para definir o tanto de dano que o atacante irá desferir no defensor. Essa quantidade de dano é subtraída pelos pontos de defesa do defensor. Se o rolamento de dado do atacante for 1, ele erra, e o defensor não sofre nenhum dano. Se o rolamento de dado do atacante for 20, ele conseguirá um acerto crítico, e o seu ataque ignora a defesa do adversário (ou seja, o dano que ele desfere é 100%, sem subtrair pelos pontos de defesa do defensor).
		
		Quando o inimigo ataca, é realizado o cálculo do ataque e o jogo deve atualizar os pontos de vida do jogador, e exibir a mensagem: “O inimigo atacou! Você sofreu X de dano e agora possui Y pontos de vida.�? substituindo X pela quantidade de dano do ataque e Y pela quantidade de pontos de vida atual do jogador. Se o inimigo errar, a mensagem exibida deve ser “O inimigo errou o ataque! Você não sofreu dano.�?. Se o inimigo acertar um ataque crítico, a mensagem deve ser: "O inimigo acertou um ataque crítico! Você sofreu X de dano e agora possui Y pontos de vida.".
		Caso o ataque do inimigo te leve a 0 pontos de vida, você morre, e a mensagem exibida deve ser “Você não estava preparado para a força do inimigo. {COMPLEMENTO DE ACORDO COM A MOTIVAÇÃO}�?, substituindo o conteúdo entre chaves de acordo com a motivação do personagem selecionada no início do jogo. VINGANÇA: “Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.�? GLÓRIA: “A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).�? (o gênero deve ser alterado para refletir o sexo do personagem escolhido pelo jogador no início do jogo). O jogo encerra quando o jogador morre.

		Quando é a vez do jogador fazer uma ação, deve ser perguntado a ele se ele deseja atacar ou fugir. Se escolher fugir, o jogo deve exibir a mensagem “Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.�?.
		Se escolher atacar, o jogo deve realizar o cálculo do ataque e atualizar os pontos de vida do inimigo. O jogo deve exibir a mensagem “Você atacou {COMPLEMENTO DA ARMA} e causou X de dano no inimigo!�?, substituindo o conteúdo entre chaves de acordo com a arma do personagem. Espada, machado, martelo ou clava: “com sua/seu {ARMA}�?. Arco+flecha ou besta+virote: “com seu/sua {ARMA}, a/o {MUNIÇÃO} atingiu�?. Cajado: “com seu cajado, lançando uma bola de fogo�?. Livro: “absorvendo energia do livro com uma mão e liberando com a outra�?.
		Se o jogador errar, a mensagem exibida deve ser “Você errou seu ataque! O inimigo não sofreu dano algum.�?. Se o jogador acertar um ataque crítico, a mensagem deve ser: "Você acertou um ataque crítico! {COMPLEMENTO}�? substituindo o conteúdo entre chaves pela mensagem de ataque normal.
		Caso o inimigo morra com o seu ataque, o jogo deve exibir “O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.�?
		*/

	}
}
