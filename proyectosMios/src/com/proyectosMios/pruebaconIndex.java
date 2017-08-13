package com.proyectosMios;

public class pruebaconIndex {
	String palabra;
	public pruebaconIndex() {
		
	}
	//esta es una prueba
	public void sacarIndex(String palabras) {
		int posicion=palabras.indexOf("Hola");
		System.out.println(posicion);
		//return String.valueOf(posicion);//parse de string a entero
		//Integer.toString(i) <- lo opuesto
		posicion=palabras.indexOf("Hola", posicion+1);
		System.out.println(posicion);
		char resultado = palabras.charAt(11);
		System.out.println(resultado);
	}									
	
	
	public static void main (String[] args)
	{
		pruebaconIndex pru =new pruebaconIndex();
		pru.sacarIndex("mundo Hola yo me llamo Hola");
	}

}
