package Semana10Modulo01;

import java.util.Calendar;

public class Ex04 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int horaAtual = calendario.get(Calendar.HOUR_OF_DAY);
		int minutoAtual = calendario.get(Calendar.MINUTE);
		
		if (horaAtual >=6 && horaAtual < 12) {
			System.out.println("Bom dia, agora são " + horaAtual + ":" + minutoAtual + " horas da manhã.");
		}
		if (horaAtual >=12 && horaAtual < 18) {
			System.out.println("Boa tarde, agora são " + horaAtual + ":" + minutoAtual + " horas da tarde.");
		}
		if (horaAtual >=18 && horaAtual < 6) {
			System.out.println("Boa noite, agora são " + horaAtual + ":" + minutoAtual + " horas da noite.");
		}
	}

}
