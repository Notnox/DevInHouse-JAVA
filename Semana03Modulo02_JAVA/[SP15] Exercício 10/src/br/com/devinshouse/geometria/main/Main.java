package br.com.devinshouse.geometria.main;

import br.com.devinshouse.geometria.formas.Forma;
import br.com.devinshouse.geometria.formas.FormaBidimensional;
import br.com.devinshouse.geometria.formas.FormaTridimensional;

public class Main {

	public static void main(String[] args) {
		FormaBidimensional formaBi = new FormaBidimensional(0, 4, 4, 4, 0, 0, 4, 0);
		FormaBidimensional formaBi2 = new FormaBidimensional(0, 4, 4, 4, 0, 0, 4, 0);
		FormaTridimensional formaTri = new  FormaTridimensional(0, 4, 4, 4,
				4, 4, 0, 0,
				4, 4, 0, 4, 
				0, 4, 0, 4, 
				4, 0, 0, 0, 
				0, 4, 0, 0);
		FormaTridimensional formaTri2 = new  FormaTridimensional(0, 4, 4, 4,
				4, 4, 0, 0,
				4, 4, 0, 4, 
				0, 4, 0, 4, 
				4, 0, 0, 0, 
				0, 4, 0, 0);
		
		if (formaBi.equals(formaBi2)) {System.out.println("Mesma forma!");} else {System.out.println("Outra forma!");}
		if (formaTri.equals(formaTri2)) {System.out.println("Mesma forma!");} else {System.out.println("Outra forma!");}
		if (formaTri.equals(formaBi)) {System.out.println("Mesma forma!");} else {System.out.println("Outra forma!");}
	}
	
}
