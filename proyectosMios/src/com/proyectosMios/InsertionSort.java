package com.proyectosMios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int [] lista = new int[5];
		System.out.println("ingrese la lista de numeros: ");
		Scanner sc = new Scanner (System.in);
		
		for(int i=0;i<lista.length;i++) {
		
			a=sc.nextInt();
			lista[i]=a;	
		}
		System.out.println("los numeros en la lista son");
		for(int j=0;j<lista.length;j++) {
			System.out.print(" "+ lista[j]);
		}
	}

}
