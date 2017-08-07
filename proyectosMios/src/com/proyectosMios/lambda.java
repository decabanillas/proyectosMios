package com.proyectosMios;
import java.util.function.*;
public class lambda {
	
	
	interface Suma{
		public int sumarDosNumeros(int a, int b);
	}
	public static void main(String[] args) {
		Suma  suma=(a,b) -> {return a+b;};
		System.out.println(suma.sumarDosNumeros(4, 3));
	
	}

 
}
