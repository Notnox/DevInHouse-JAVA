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
		System.out.println("Seja bem vindo(a) ��BATALHA FINAL!");
		Utilitario.pause(1000);
		Jogador player1 = EntradaScanner.EntradaDeClasse();
		Utilitario.pause(1000);
		System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo,\n"
				+ "e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o.\n"
				+ "Voc� olha para o portal �sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
		Utilitario.pause(1000);
		System.out.println("Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente.\n"
				+ "Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno.\n"
				+ "Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas.\n"
				+ "Voc� est� a um passo de encerrar para sempre esse mal.");
		
		System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
		Utilitario.pause(1000);
		EntradaScanner.entradaDaMotivacao(player1);
		
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Imagens daquela noite tr�gica invadem sua mente.\n"
				+ "Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes,\n"
				+ "mesmo que de plano de fundo, quando voc� tem outros pensamentos em foco, elas nunca o deixaram.\n"
				+ "Elas s�o o combust�-vel que te fizeram chegar at� aqui.\n"
				+ "E voc� sabe que n�o ir� desistir at� ter vingado a morte\n"
				+ "daqueles que foram e pra sempre ser�o a sua fonte de amor e desejo de continuar vivo.\n"
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
		Utilitario.pause(1000);
		System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas,\n"
				+ "suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado.\n"
				+ "Voc� avan�a pelo portal.");
		Utilitario.pause(1000);
		System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal por suas costas.\n"
				+ "� sua frente, � poss�vel perceber que voc� se encontra em um corredor extenso.\n"
				+ "Voc� pode ir para frente, ou desistir.");
		Utilitario.pause(1000);
		if (EntradaScanner.EntradaParaDesistir()) {
			System.out.println("O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\n"
					+ "Voc� se volta para a noite l� fora, e corre em dire��o � seguran�a.");
			System.exit(0);
		}
		
		System.out.println("Voc� caminha, atento a todos os seus sentidos, por v�rios metros,\n"
					+ "at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha,\n"
					+ "vindo de dentro de uma porta aberta.");
		Utilitario.pause(1000);
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
		Utilitario.pause(1000);
		System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada.\n"
				+ "Segura com mais for�a a sua arma com uma m�o, enquanto empurra a porta com a outra.\n"
				+ "Ao entrar, voc� se depara com uma sala espa�osa,\n"
				+ "com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas.\n"
				+ "Voc� imagina que este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados\n"
				+ "utilizam quando saem para espalhar o terror nas cidades e vilas da regi�o.\n"
				+ "Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s.\n"
				+ "Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo.\n"
				+ "Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate.\n"
				+ "Ele avan�a em sua dire��o.");
		Armeiro capitaoArmeiro = new Armeiro(0, 0, 0, null);
		combate(player1, capitaoArmeiro, false);
		Utilitario.pause(1000);
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
		Utilitario.pause(1000);
		System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta "
				+ "do l�der inimigo.\n"
				+ "Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
		Utilitario.pause(1000);
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
		combate(player1, capitaoAlquimista, false);
		Utilitario.pause(1000);
		System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo.\n"
				+ "Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado,\n"
				+ "pega a garrafa e pondera se deve beber um gole.");
		if (EntradaScanner.EntradaParaPocao()) {
			System.out.println("Voc� se sente revigorado para seguir adiante!");
			player1.receberVidaMaxima();
		} else {
			System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");
		}
		Utilitario.pause(1000);
		System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa,\n"
				+ "e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo.\n"
				+ "Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		Utilitario.pause(1000);
		System.out.println("De volta � sala das portas, voc� se dirige � porta final.\n"
				+ "Coloca as chaves nas fechaduras, e a porta se abre.\n"
				+ "Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente,\n"
				+ "e voc� percebe que est� muito pr�ximo do seu objetivo final.\n"
				+ "Segura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta.");
		
		System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, "
				+ "e prisioneiros acorrentados � paredes.");
		Utilitario.pause(1000);
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");
		Lider lider = new Lider(0, 0, 0, null);
		combate(player1, lider, EntradaScanner.EntradaParaAtacar());
		Utilitario.pause(1000);
		System.out.println("Voc� conseguiu!");
		if (player1.getMotivacao() == Motivacao.VINGANCA) {
			System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma "
					+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. "
					+ "Agora voc� pode seguir sua vida.");
		} else {
			System.out.println("O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se "
					+ "ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.");
		}
		Utilitario.pause(1000);
		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
				+ "e todos voc�s saem em dire��o � noite, retornando � cidade.\n"
				+ "Seu dever est� cumprido.");
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
					System.out.println("Voc� n�o estava preparado para a for�a do inimigo, "
							+ "e decide fugir para que possa tentar novamente em uma pr�xima vez.");
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
					System.out.print("Voc� acertou um ataque cr�tico ");
				} else if (ataquePlayer == 0) {
					calculoDanoPlayer = 0;
					System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
				} else {
					calculoDanoPlayer = ataquePlayer - alvo.getPontosDeDefesa();
					System.out.print("Voc� atacou ");
				}

				if (calculoDanoPlayer > 0) {
					alvo.receberDano(calculoDanoPlayer);
					System.out.printf("%s e causou %d de dano no inimigo!%n", 
							player.getArma().getAtaque(player.getArma()), calculoDanoPlayer);
					
					if (alvo.getPontosDeVida() <= 0) {
						System.out.println("O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s!");
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
					System.err.print("\nO inimigo acertou um ataque cr�tico! ");
				} else if (ataqueAlvo == 0) {
					calculoDanoAlvo = 0;
					System.err.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
				} else {
					calculoDanoAlvo = ataqueAlvo - player.getPontosDeDefesa();
					System.err.print("\nO inimigo atacou! ");
				}
				Utilitario.pause(1000);
				if (calculoDanoAlvo > 0) {
					player.receberDano(calculoDanoAlvo);
					if (player.getPontosDeVida() <= 0) {
						System.out.println("Voc� n�o estava preparado para a for�a do inimigo. ");
						if (player.getMotivacao() == Motivacao.GLORIA) {
							if (player.getSexo().intern() == "F") {
								System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima hero�na.");
							} else {
								System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i.");
							}
						} else {
							System.out.println("N�o foi poss�vel concluir sua vingan�a, e "
									+ "agora resta saber se algu�m se vingar� por voc�.");
						}
						System.exit(0);
					}
					System.err.printf("Voc� sofreu %d de dano e agora possui %d pontos de vida.%n",
							calculoDanoAlvo, player.getPontosDeVida());
				}
			}
			turnoPlayer = !turnoPlayer;
		} while (alvo.getPontosDeVida() > 0);
	}
	
}
