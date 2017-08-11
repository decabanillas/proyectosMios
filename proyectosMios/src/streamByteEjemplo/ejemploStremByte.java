package streamByteEjemplo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ejemploStremByte {
	public FileInputStream miarchivo;
	public int contador=0;
	ArrayList<Integer> almacen=new ArrayList<Integer>();
	//constructor
	public ejemploStremByte(){
		
	}
	public void lee() {//lee la imagen
		try {
			miarchivo =new FileInputStream("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
			boolean fin =false;
			while(!fin) {
				int byte_entrada=miarchivo.read();
				if(byte_entrada!=-1) {
					almacen.add(byte_entrada);	
				}
							
				else {
					fin=true;
				}
					
				contador++;
				//System.out.println(byte_entrada);
				
				
			}
			System.out.println(almacen.size());//almacenando en un arraylist
			//System.out.println(contador);//cuenta cuantos bytes tiene la imagen
			miarchivo.close();
		}catch(IOException e) {
			
			System.out.println("no se encuentra el archivo");
		}
			
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejemploStremByte ejemplo =new ejemploStremByte();
		ejemplo.lee();

	}

}
