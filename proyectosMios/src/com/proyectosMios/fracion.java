package com.proyectosMios;

public class fracion {
	private int numerador;
	private int denominador;
	
	public fracion(int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	
	public int getDenominador() {
		return denominador;
	}
	public int getNumerador() {
		return numerador;
	}
	
	public void setNumerador(int num) {
		numerador=num;
	}
	public void setDenominador(int den) {
		if (den==0) {
			System.err.println("Fatal error");
			System.exit(1);
		}
		denominador=den;
	}
	public String toString() {
		return getNumerador() + "/" + getDenominador();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fracion fr =new fracion (5,4);
		System.out.println(fr.getNumerador());
		System.out.println(fr.toString());
		
	}

}
