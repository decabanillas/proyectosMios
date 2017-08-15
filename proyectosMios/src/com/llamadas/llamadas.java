package com.llamadas;

public class llamadas {
	private int edad;
	private String nombre;
	private String apellido;
	public llamadas(int e,String n, String ap) {
		this.edad=e;
		this.nombre=n;
		this.apellido=ap;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int ee) {
		edad=ee;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nn) {
		nombre=nn;
	}
	public String getApellido() {
		return apellido;
	}
	public String toString() {
		return "edad" + edad + "nombre"+nombre;
	}
	
	public static void main (String[]args) {
		llamadas a1=new llamadas(15,"Deiby","Cabanillas");
		System.out.println(a1.getNombre());
		a1.setNombre(a1.getApellido());//pasando el apellido como nombre
		System.out.println(a1.getNombre());
	}
}
