package miStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class miStream {
	//flujo de bytes imputStream, OutputStream(informacion en bytes)
	//secuencia de caracteres reader writer
	FileReader entrada;
			public miStream(){
				
				
			}
			
				public void lee() {
					try {
						entrada =new FileReader("C:/Users/HP/Documents/ejemplo.txt");
						BufferedReader mibufer= new BufferedReader(entrada);
						//fileImputStream abre cualquier tipo de archivo
						/*//esto antes del buffer (el buffer es mas optimo para mucho texto)
						int c=0;
						//-1 indica el final
						while(c!=-1) {
							c=entrada.read();
							char letra = (char)c;
							System.out.print(letra);*/
							String linea="";
								while(linea!=null) {
									linea=mibufer.readLine();
									if(linea!=null) {
										System.out.println(linea);
									}
								}
							
							
						
						//
					}catch(IOException e) {
						System.out.println("no se encuentra el texto");
					}finally {
						try {
							entrada.close();
						}catch(IOException e) {
							System.out.println("exepcion de finally");
						}
					}
				
				
				}
				
		public static void main (String [] args ) {
					miStream archivo = new miStream();
					archivo.lee();
					//System.out.println();
	    }
		
	}
	
	



