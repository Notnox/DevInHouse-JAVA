package Semana10Modulo01;

import java.util.Calendar;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int diaHoje = calendario.get(Calendar.DAY_OF_MONTH);
		int mesHoje = calendario.get(Calendar.MONTH);
		int anoHoje = calendario.get(Calendar.YEAR);
		String dataHoje = diaHoje + "/" + mesHoje + "/" + anoHoje;		
		Scanner cadastro = new Scanner(System.in);
		String arrayDataInformada[] = new String[3];
		String dataInformada;
		int diaInformado;
		int mesInformado;
		int anoInformado;
		int idade = 0;
		
		System.out.print("Informe a sua data de nascimento: (ex. 01/10/2015) ");
		dataInformada = cadastro.next();
		arrayDataInformada = dataInformada.split("/");
		
		diaInformado = Integer.parseInt(arrayDataInformada[0]);
		mesInformado = Integer.parseInt(arrayDataInformada[1]);
		anoInformado = Integer.parseInt(arrayDataInformada[2]);
		
		if (anoInformado < anoHoje) {
			if (mesInformado > mesHoje + 1) {
				idade = anoHoje - anoInformado - 1;
			}
			if (mesInformado < mesHoje + 1) {
				idade = anoHoje - anoInformado;
			}
			if (mesInformado == mesHoje + 1) {
				if (diaInformado > diaHoje) {
					idade = anoHoje - anoInformado - 1;
				} else {
					idade = anoHoje - anoInformado;
				}
			}
		} else {
			idade = 0;
		}
		if (idade < 18) {
			System.out.print("Menor de idade! Você tem " + idade + " anos.");
		} else {
			System.out.print("Maior de idade! Você tem " + idade + " anos.");
		}
		
	}

}
