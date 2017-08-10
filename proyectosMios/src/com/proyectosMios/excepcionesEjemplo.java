package com.proyectosMios;

import java.util.Scanner;

public class excepcionesEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
			System.out.println("Dame un entero: ");
		try {
			Scanner sc =new Scanner(System.in);
			x=sc.nextInt();	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("No me diste un entero");
		}finally {//el finally es un codigo que siempre se ejecutara
			System.out.println("proceso terminado");
		}
	}

}
