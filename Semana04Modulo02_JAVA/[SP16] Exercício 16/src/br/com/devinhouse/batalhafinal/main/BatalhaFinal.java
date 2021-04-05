package br.com.devinhouse.batalhafinal.main;

import br.com.devinhouse.batalhafinal.classes.Alquimista;
import br.com.devinhouse.batalhafinal.classes.Armeiro;
import br.com.devinhouse.batalhafinal.classes.Lider;
import br.com.devinhouse.batalhafinal.enums.Arma;
import br.com.devinhouse.batalhafinal.enums.Motivacao;
import br.com.devinhouse.batalhafinal.personagens.Armadilha;
import br.com.devinhouse.batalhafinal.personagens.Inimigo;
import br.com.devinhouse.batalhafinal.personagens.Jogador;
import br.com.devinhouse.batalhafinal.personagens.Personagem;
import br.com.devinhouse.batalhafinal.utils.Utilitario;
import br.com.devinshouse.batalhafinal.validacoes.EntradaScanner;

public class BatalhaFinal {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo(a) À BATALHA FINAL!");
		Utilitario.pause(1000);
		Jogador player1 = EntradaScanner.EntradaDeClasse();
		Utilitario.pause(1000);
		System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,\n"
				+ "e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.\n"
				+ "Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");
		Utilitario.pause(1000);
		System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente.\n"
				+ "Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno.\n"
				+ "Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas.\n"
				+ "Você está a um passo de encerrar para sempre esse mal.");
		
		System.out.println("Buscando uma injeção de ánimo, você se força a lembrar o que te trouxe até aqui.");
		Utilitario.pause(1000);
		EntradaScanner.entradaDaMotivacao(player1);
		
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Imagens daquela noite trágica invadem sua mente.\n"
				+ "Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes,\n"
				+ "mesmo que de plano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram.\n"
				+ "Elas são o combustí-vel que te fizeram chegar até aqui.\n"
				+ "E você sabe que não irá desistir até ter vingado a morte\n"
				+ "daqueles que foram e pra sempre serão a sua fonte de amor e desejo de continuar vivo.\n"
				+ "O maldito líder finalmente pagará por tanto mal causado na vida de tantos\n"
				+ "(e principalmente na sua).");
		} else {
			System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos,\n"
				+ "bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas,\n"
				+ "taberneiros se recusando a cobrar por suas bebedeiras e comilanças.\n"
				+ "Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas,\n"
				+ "depois de destruir o vilão que tanto assombrou a paz de todos.\n"
				+ "Porém, você sabe que ainda falta o último ato dessa história.\n"
				+ "Você se concentra na missão.\n"
				+ "A glória o aguarda, mas não antes da última batalha.");
		}
		Utilitario.pause(1000);
		System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,\n"
				+ "suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\n"
				+ "Você avança pelo portal.");
		Utilitario.pause(1000);
		System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal por suas costas.\n"
				+ "À sua frente, é possível perceber que você se encontra em um corredor extenso.\n"
				+ "Você pode ir para frente, ou desistir.");
		Utilitario.pause(1000);
		if (EntradaScanner.EntradaParaDesistir()) {
			System.out.println("O medo invade o seu coração e você sente que ainda não esté à altura do desafio.\n"
					+ "Você se volta para a noite lá fora, e corre em direção à segurança.");
			System.exit(0);
		}
		
		System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros,\n"
					+ "até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha,\n"
					+ "vindo de dentro de uma porta aberta.");
		Utilitario.pause(1000);
		System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
				+ "e pondera sobre como passar pela porta.");
		int movimentacao = EntradaScanner.EntradaParaMovimentacao();
		if (movimentacao == 3) {
			System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
		} else if (movimentacao == 2) {
			System.out.println("Você respira fundo e desata a correr em direção á sala.\n"
					+ "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
					+ "mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos.\n"
					+ "Nâo tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você,\n"
					+ "e quando se vira, vê várias flechas no chão.\n"
					+ "Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
					+ "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
		} else {
			System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz.\n"
					+ "Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\n"
					+ "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor.\n"
					+ "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
			Armadilha armadilhaDeFlechas = new Armadilha();
			System.err.println(armadilhaDeFlechas.atacar(player1));
		}
		System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
				+ "Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras trás estão fechadas.\n"
				+ "A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler,\n"
				+ "mas reconhece como sendo a língua antiga utilizada pelo inimigo.\n"
				+ "Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas,\n"
				+ "e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais,\n"
				+ "antes de conseguir enfrentar o líder.");
		
		System.out.println("Você se dirige para a porta à direita.");
		Utilitario.pause(1000);
		System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
				+ "Segura com mais força a sua arma com uma mão, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, você se depara com uma sala espaçosa,\n"
				+ "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas.\n"
				+ "Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados\n"
				+ "utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
				+ "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\n"
				+ "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitões do inimigo.\n"
				+ "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate.\n"
				+ "Ele avança em sua direção.");
		Armeiro capitaoArmeiro = new Armeiro(0, 0, 0, null);
		combate(player1, capitaoArmeiro, false);
		Utilitario.pause(1000);
		System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados.\n"
				+ "Olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
		
		if (EntradaScanner.EntradaParaRenovacao()) {
			System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n"
					+ "que estavam danificadas, pelas peças de armaduras existentes na sala.\n"
					+ "De armadura nova, você se sente mais protegido para os desafios à sua frente.");
			player1.receberArmadura(5);
		} else {
			System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
		}
		Utilitario.pause(1000);
		System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta "
				+ "do líder inimigo.\n"
				+ "Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
		Utilitario.pause(1000);
		System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda.\n"
				+ "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
				+ "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
				+ "existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas,\n"
				+ "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes,\n"
				+ "criando poções utilizadas pelos soldados para aterrorizar a região.");
		System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitões do inimigo.\n"
				+ "Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
		Alquimista capitaoAlquimista = new Alquimista(0, 0, 0, null);
		combate(player1, capitaoAlquimista, false);
		Utilitario.pause(1000);
		System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\n"
				+ "Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado,\n"
				+ "pega a garrafa e pondera se deve beber um gole.");
		if (EntradaScanner.EntradaParaPocao()) {
			System.out.println("Você se sente revigorado para seguir adiante!");
			player1.receberVidaMaxima();
		} else {
			System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
		}
		Utilitario.pause(1000);
		System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa,\n"
				+ "e sabe que aquela chave abre a outra fechadura da porta do líder inimigo.\n"
				+ "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		Utilitario.pause(1000);
		System.out.println("De volta à sala das portas, você se dirige à porta final.\n"
				+ "Coloca as chaves nas fechaduras, e a porta se abre.\n"
				+ "Seu coração acelera, memérias de toda a sua vida passam pela sua mente,\n"
				+ "e você percebe que está muito próximo do seu objetivo final.\n"
				+ "Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
		
		System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, "
				+ "e prisioneiros acorrentados à paredes.");
		Utilitario.pause(1000);
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lámina dupla.");
		Lider lider = new Lider(0, 0, 0, null);
		combate(player1, lider, EntradaScanner.EntradaParaAtacar());
		Utilitario.pause(1000);
		System.out.println("Você conseguiu!");
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma "
					+ "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. "
					+ "Agora você pode seguir sua vida.");
		} else {
			System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se "
					+ "ajoelha e grita de alegria. A glória o aguarda, você a conquistou.");
		}
		Utilitario.pause(1000);
		System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
				+ "e todos vocês saem em direção à noite, retornando à cidade.\n"
				+ "Seu dever está cumprido.");
	}
	
	private static void combate(Jogador player, Inimigo alvo, boolean primeiroAtaque) {	
		
		boolean turnoPlayer;
		int ataquePlayer = 0;
		int ataqueAlvo = 0;
		int calculoDanoPlayer = 0;
		int calculoDanoAlvo = 0;
		int rolarDado = Utilitario.rolarDado(1, 20);
		
		if (primeiroAtaque) {
			if (rolarDado < 15) {
				turnoPlayer = true;
			} else {
				turnoPlayer = false;
			}
		} else {
			if (rolarDado < 10) {
				turnoPlayer = true;
			} else {
				turnoPlayer = false;
			}
		}
		
		do {
			rolarDado = Utilitario.rolarDado(1, 20);
			if (turnoPlayer) {
				Utilitario.pause(1000);
				if (EntradaScanner.EntradaParaDesistir()) {
					System.out.println("Você não estava preparado para a força do inimigo, "
							+ "e decide fugir para que possa tentar novamente em uma próxima vez.");
					System.exit(0);
				}
				
				if (rolarDado == 1) {
					ataquePlayer = 0;
				} else {
					ataquePlayer = player.getPontosDeAtaque() + player.getArma().getDano(player.getArma()) + rolarDado;
				}
				Utilitario.pause(1000);
				if (rolarDado == 20) {
					calculoDanoPlayer = ataquePlayer;
					System.out.print("Você acertou um ataque crítico ");
				} else if (ataquePlayer == 0) {
					calculoDanoPlayer = 0;
					System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
				} else {
					calculoDanoPlayer = ataquePlayer - alvo.getPontosDeDefesa();
					System.out.print("Você atacou ");
				}

				if (calculoDanoPlayer > 0) {
					alvo.receberDano(calculoDanoPlayer);
					System.out.printf("%s e causou %d de dano no inimigo!%n", 
							player.getArma().getAtaque(player.getArma()), calculoDanoPlayer);
					
					if (alvo.getPontosDeVida() <= 0) {
						System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés!");
					}
				}
			} else {
				Utilitario.pause(1000);
				if (rolarDado == 1) {
					ataqueAlvo = 0;
				} else {
					ataqueAlvo = alvo.getPontosDeAtaque() + alvo.getArma().getDano(alvo.getArma()) + rolarDado;
				}
				
				if (rolarDado == 20) {
					calculoDanoAlvo = ataqueAlvo;
					System.err.print("\nO inimigo acertou um ataque crítico! ");
				} else if (ataqueAlvo == 0) {
					calculoDanoAlvo = 0;
					System.err.println("O inimigo errou o ataque! Você não sofreu dano.");
				} else {
					calculoDanoAlvo = ataqueAlvo - player.getPontosDeDefesa();
					System.err.print("\nO inimigo atacou! ");
				}
				Utilitario.pause(1000);
				if (calculoDanoAlvo > 0) {
					player.receberDano(calculoDanoAlvo);
					if (player.getPontosDeVida() <= 0) {
						System.out.println("Você não estava preparado para a força do inimigo. ");
						if (player.getMotivacao() == Motivacao.GLORIA) {
							if (player.getSexo().intern() == "F") {
								System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína.");
							} else {
								System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
							}
						} else {
							System.out.println("Não foi possível concluir sua vingança, e "
									+ "agora resta saber se alguém se vingará por você.");
						}
						System.exit(0);
					}
					System.err.printf("Você sofreu %d de dano e agora possui %d pontos de vida.%n",
							calculoDanoAlvo, player.getPontosDeVida());
				}
			}
			turnoPlayer = !turnoPlayer;
		} while (alvo.getPontosDeVida() > 0);
	}
	
}
