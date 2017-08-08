package com.ejemploImplement;
import com.herencia.otra;

//el implement es como una multiple herencia AQUIIII OTRA OPERACION MULTIHERENCIA
public class suma implements sumarCodigo,otraOperacion,otra{
	int a,b;
	public suma(){
		this.a=5;
		this.b=10;
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("suma de variables locales: "+(a+b) );
		System.out.println("suma de variables de instancia: "+(this.a+this.b) );
		return 0;
	}
	@Override
	public int resta(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("suma de variables locales: "+(a-b) );
		System.out.println("suma de variables de instancia: "+(this.a-this.b) );
		return 0;
	}
	//este viene de herencia, la interface "otra" de otro paqueete(com.herencia)
	@Override
	public void otro() {
		// TODO Auto-generated method stub
		System.out.println("Yo vengo de com.herencia");
		
	}
	public static void main(String []args) {
		suma sum =new suma();
		System.out.println(sum.sumar(10, 8));
		System.out.println(sum.resta(10, 8));
		sum.otro();
	}

	

	
	
}
