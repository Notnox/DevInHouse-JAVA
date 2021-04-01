package br.com.devinshouse.geometria.main;

import br.com.devinshouse.geometria.formas.Forma;
import br.com.devinshouse.geometria.formas.FormaBidimensional;
import br.com.devinshouse.geometria.formas.FormaTridimensional;

public class Main {

	public static void main(String[] args) {
		FormaBidimensional formaBi = new FormaBidimensional(0, 4, 4, 4, 0, 0, 4, 0);
		FormaTridimensional formaTri = new  FormaTridimensional(0, 4, 4, 4,
				4, 4, 0, 0,
				4, 4, 0, 4, 
				0, 4, 0, 4, 
				4, 0, 0, 0, 
				0, 4, 0, 0);
		
		Forma arrayFormas[] = new Forma[2];
		arrayFormas[0] = formaBi;
		arrayFormas[1] = formaTri;
		
		for (Forma f : arrayFormas) {
			Forma.getForma(f);
		}
		
	}
	
}
