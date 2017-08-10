package com.proyectosMios;

import java.util.Date;
import java.util.GregorianCalendar;

import com.herencia.camion;

public class Empleado {
	private String nombre;
	private double sueldo;
	private int Id;
	private Date altaContrato;
	private static int IdSiguiente;
	//constructor 1
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
	
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia); 
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	//constructor 2 sobrecarga de constructoresm si solo conocemos el nombre
	//le da un estado inicial
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	
	public String dameNombre() {//get
		return nombre+"ID: "+Id;
	}
	public double dameSueldo() {//getter
		return sueldo;
	}
	public Date dameFechaContrato() {//getter
		return altaContrato;
	}
	public void subeSueldo (double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;		
	}
	public static void main(String[] args) {
		Jefatura jefe=new Jefatura("Deiby",55000,2017,8,16);
		jefe.estableIncentivo(2000.30);
		System.out.println(jefe.dameSueldo());
	}

}

class Jefatura extends Empleado{
	private double incentivo;
	
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
									 // dependiendo del tipo de parametros, decide q constructor elige
		super(nom,sue,agno,mes,dia); //llamar al constructor de la clase padre
	}
	
	public void estableIncentivo(double b) {//set
		incentivo=b;
	}
	
	public double dameSueldo() {//get
		//damesueldo() sin super llama al mismo metodo, por eso añadimos super para q llame el de la clase padre
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	
	
}


