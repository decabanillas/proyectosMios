package com.herencia;
//la herencia permite solo se permite heredar de uno sola clase, la implementacion de varias(multi herencia)
public class camion extends auto{
	
	int peso;
	public camion(String marca, int ruedas) {
		super(marca, ruedas);
		this.peso=400;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camion volvo=new camion("BMW",4);
		volvo.setMarca("Ferrari");
		System.out.println(volvo.getMarca()+"  "+volvo.getRuedas()+" "+ volvo.getPeso());
	}

}
