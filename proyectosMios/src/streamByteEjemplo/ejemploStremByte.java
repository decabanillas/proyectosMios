package streamByteEjemplo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;

public class ejemploStremByte {
	public FileInputStream miarchivo;
	public int contador=0;
	public static Color colorAux;
	static BufferedImage imagen,bmp=null;
	ArrayList<Integer> almacen=new ArrayList<Integer>();
	private static BufferedImage imageActual;
	
	
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
			
			escribe(almacen); //llama al metodo para crear la copia de la imagen
			gris(almacen);
		
		}catch(IOException e) {
			
			System.out.println("no se encuentra el archivo");
		}
			
		
		
	}
	
	static void escribe(ArrayList <Integer> datos_nuevos) {
		try {
			FileOutputStream salida =new FileOutputStream("C:/Users/Public/Pictures/Sample Pictures/Pen2.jpg");
			for(int i=0;i<datos_nuevos.size();i++) {
				salida.write(datos_nuevos.get(i));
				
			}
			salida.close();
		}catch(IOException e) {
			System.out.println("no cierra");
		}
	}
	
	static void gris(ArrayList<Integer> datos_gris) {
		try {
			FileOutputStream salida =new FileOutputStream("C:/Users/Public/Pictures/Sample Pictures/Pen3.jpg");
			for(int i=0;i<datos_gris.size();i++) {
				/*int mediaPixel, colorSRGB;
				int rgb =datos_gris.get(i);
				colorAux=new Color(imageActual.getRaster().getPixel(250,100, 0));
				mediaPixel=(int)((colorAux.getRed()+colorAux.getGreen()+colorAux.getBlue())/3);
				colorSRGB=(mediaPixel << 16) | (mediaPixel << 8) | mediaPixel;
				
				salida.write(colorSRGB);
				*/
				
			}
			salida.close();
		}catch(IOException e) {
			System.out.println("no cierra");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejemploStremByte ejemplo =new ejemploStremByte();
		ejemplo.lee();
		

	}

}
