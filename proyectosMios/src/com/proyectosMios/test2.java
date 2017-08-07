package com.proyectosMios;

import java.util.ArrayList;
import java.util.HashMap;

public class test2 {
	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89); 
		weeklyTemperatures.add(94);
		
		for (Integer temperature:weeklyTemperatures) {
			System.out.println(temperature);
		}
    
	    HashMap<String,Integer> restaurantMenu = new HashMap<String,Integer>();
	    restaurantMenu.put("Turkey Burger",13);
	      restaurantMenu.put("Naan Pizza",11);
	      restaurantMenu.put("Cranberry Kale Salad",10);
	      System.out.println(restaurantMenu.keySet());
	      System.out.println(restaurantMenu.values());
	      System.out.println(restaurantMenu.get("Naan Pizza"));
	      
	  	  System.out.println(restaurantMenu.size());

		for (String item:restaurantMenu.keySet()) {

			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
		}
	}
}

/*import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		weeklyTemperatures.add(2, 111);

		for(int j=0;j<weeklyTemperatures.size();j++){
      System.out.println(weeklyTemperatures.get(j));
    }
	}
}*/

/*
import java.util.Scanner;
public class test {
    public static void main(String[] args) {     
           Scanner sc = new Scanner(System.in);
           String nombre;
           double radio;
           int n;        
           System.out.print("Introduzca el radio de la circunferencia: ");
           radio = sc.nextDouble();
           System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
           System.out.print("Introduzca un número entero: ");
           n = sc.nextInt();
           System.out.println("El cuadrado es: " + Math.pow(n,2));
           System.out.print("Introduzca su nombre: ");       
           nombre = sc.nextLine();  //leemos el String después del double
           sc.nextLine();//en caso de strin para q te pida
           System.out.println("Hola " + nombre + "!!!");
     }
}
*/