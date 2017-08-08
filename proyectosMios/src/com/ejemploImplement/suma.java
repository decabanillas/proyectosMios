package com.ejemploImplement;

public class suma implements sumarCodigo{
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
	public static void main(String []args) {
		suma sum =new suma();
		System.out.println(sum.sumar(10, 8));
	}
	
}
