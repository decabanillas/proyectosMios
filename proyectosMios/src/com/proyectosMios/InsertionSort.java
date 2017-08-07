package com.proyectosMios;

import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v,j,temp=0;
		int [] lista = new int[5];
		System.out.println("ingrese la lista de numeros: ");
		Scanner sc = new Scanner (System.in);
		
		for(int i=0;i<lista.length;i++) {
		
			lista[i]=sc.nextInt();
			
		}
		System.out.println("los numeros en la lista son");
		for(int i=0;i<lista.length;i++) {
			System.out.print(" "+ lista[i]);
		}
		
		for(int i =1; i<lista.length;i++ ) {
			v=lista[i];
			j=i-1;
			while ( j>=0 && v<lista[j]) {
				temp=lista[j];
				lista[j]=lista[j+1];
				lista[j+1]=temp;
				j--;
			}
			//lista[j]=v;
		}
		System.out.println(" ");
		System.out.println("la lista ordenada es: ");
		for(int i=0;i<lista.length;i++) {
			System.out.print(" "+lista[i]);
		}
		
	}

}
