package Semana10Modulo01;

import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		
		System.out.println("O seu sistema está rodando no idioma: " + local.getDisplayLanguage() + "/" + local.getLanguage());
	}

}
