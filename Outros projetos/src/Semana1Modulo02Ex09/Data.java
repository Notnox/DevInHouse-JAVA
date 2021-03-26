package Semana1Modulo02Ex09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private boolean dataValida = true;
	
	public Data(int dia, int mes, int ano) {
	
		if (validaData(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dataValida = false;
		}
	}
	
	public int getDia() {
		return dia;
	}
	public boolean getDataValida() {
		return dataValida;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String exibirData() {
		return (this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	private boolean validaData(int dia, int mes, int ano) {
		switch (mes) {
			case 1: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 2: {
				if (ano % 4 == 0) {
					if (dia < 1 || dia > 29) {return false;}
				} else {
					if (dia < 1 || dia > 28) {return false;}
				}
				return true;
			}
			case 3: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 4: {
				if (dia < 1 || dia > 30) {return false;}
				return true;
			}
			case 5: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 6: {
				if (dia < 1 || dia > 30) {return false;}
				return true;
			}
			case 7: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 8: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 9: {
				if (dia < 1 || dia > 30) {return false;}
				return true;
			}
			case 10: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
			case 11: {
				if (dia < 1 || dia > 30) {return false;}
				return true;
			}
			case 12: {
				if (dia < 1 || dia > 31) {return false;}
				return true;
			}
		}
		return false;
	}
	
}
