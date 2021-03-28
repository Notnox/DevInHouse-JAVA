package br.com.devinhouse.formas.main;

import br.com.devinhouse.formas.quadrilatero.Quadrado;
import br.com.devinhouse.formas.quadrilatero.Retangulo;
import br.com.devinhouse.formas.quadrilatero.Trapezio;

public class Main {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(0,4,4,4,0,0,4,0);
		
		quadrado.calcularArea();
		
		Trapezio trapezio = new Trapezio(1,2,3,2,0,0,4,0);
		
		trapezio.calcularArea();
		
		Retangulo retangulo = new Retangulo(0,4,4,4,0,0,4,0);
		
		retangulo.calcularArea();
		
	}

}
