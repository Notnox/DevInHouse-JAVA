package br.com.devinhouse.batalhafinal.main;

import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!");

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
		
		System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros,\n"
					+ "até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha,\n"
					+ "vindo de dentro de uma porta aberta.");
		
		System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
				+ "e pondera sobre como passar pela porta.");
		// TODO: perguntar ao jogador se deseja passar pela porta ANDANDO CUIDADOSAMENTE, CORRENDO ou SALTANDO.
		// TODO: if SALTANDO
			System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
		// TODO: else if CORRENDO
			System.out.println("Você respira fundo e desata a correr em direção à sala.\n"
					+ "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
					+ "mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos.\n"
					+ "Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você,\n"
					+ "e quando se vira, vê várias flechas no chão.\n"
					+ "Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
					+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
		// TODO: else
			System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz.\n"
					+ "Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\n"
					+ "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor.\n"
					+ "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
			//TODO: instanciar objeto Armadilha e invocar método de causar dano.
		
		System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
				+ "Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas.\n"
				+ "A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler,\n"
				+ "mas reconhece como sendo a língua antiga utilizada pelo inimigo.\n"
				+ "Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas,\n"
				+ "e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais,\n"
				+ "antes de conseguir enfrentar o líder.");
		
		System.out.println("Você se dirige para a porta à direita.");
		
		System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
				+ "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, você se depara com uma sala espaçosa,\n"
				+ "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas.\n"
				+ "Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados\n"
				+ "utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
				+ "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\n"
				+ "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo.\n"
				+ "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate.\n"
				+ "Ele avança em sua direção.");
		// TODO: instanciar objeto Armeiro
		// TODO: iniciar loop de combate, inimigo ataca primeiro
		
		System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados.\n"
				+ "Olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
		
		// TODO: perguntar ao jogador se ele quer ou não pegar as armaduras novas.
		// TODO: Se escolher pegar
			System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n"
					+ "que estavam danificadas, pelas peças de armaduras existentes na sala.\n"
					+ "De armadura nova, você se sente mais protegido para os desafios à sua frente.");
			// TODO: deve ser acrescentado +5 pontos de defesa para o jogador.
		// TODO: se não
			System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
		
		System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo.\n"
				+ "Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
		
		System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda.\n"
				+ "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
				+ "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
				+ "existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas,\n"
				+ "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes,\n"
				+ "criando poções utilizadas pelos soldados para aterrorizar a região.");
		System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo.\n"
				+ "Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
		// TODO: instanciar objeto Alquimista
		// TODO: iniciar loop de combate, inimigo ataca primeiro
		
		System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\n"
				+ "Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado,\n"
				+ "pega a garrafa e pondera se deve beber um gole.");
		// TODO: perguntar ao jogador se ele quer ou não beber.
		// TODO: Se escolher beber
			System.out.println("Você se sente revigorado para seguir adiante!");
			// TODO: pontos de saúde do jogador devem ser restaurados 100%
		// TODO: se não
			System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
		
		System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa,\n"
				+ "e sabe que aquela chave abre a outra fechadura da porta do líder inimigo.\n"
				+ "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		
		System.out.println("De volta à sala das portas, você se dirige à porta final.\n"
				+ "Coloca as chaves nas fechaduras, e a porta se abre.\n"
				+ "Seu coração acelera, memórias de toda a sua vida passam pela sua mente,\n"
				+ "e você percebe que está muito próximo do seu objetivo final.\n"
				+ "Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
		
		System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");
		
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");
		
		// TODO: jogador deve decidir se ataca ou espera
		// TODO: iniciar loop de combate, dependendo da resposta do jogador, ele ataca primeiro
		
		System.out.println("Você conseguiu!");
		// TODO: exibir mensagem de vitória de acordo com a motivação do jogador:
		// se vingança: Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.
		// se glória: O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.
		
		System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
				+ "e todos vocês saem em direção à noite, retornando à cidade.\n"
				+ "Seu dever está cumprido.");
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
