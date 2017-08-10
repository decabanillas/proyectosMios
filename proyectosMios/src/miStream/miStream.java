package miStream;
import java.io.FileReader;
import java.io.IOException;

public class miStream {
	//flujo de bytes imputStream, OutputStream(informacion en bytes)
	//secuencia de caracteres reader writer
	
			public miStream(){
				
				
			}
				public void lee() {
					try {
						FileReader entrada =new FileReader("C:/Users/Escritorio/Desktop/tareas.txt");
						int c=0;
						//-1 indica el final
						while(c!=-1) {
							c=entrada.read();
							char letra = (char)c;
							System.out.print(letra);
							
							
						}
						entrada.close();
					}catch(IOException e) {
						System.out.println("no se encuentra la imagen");
					}
				
				
				}
				
		public static void main (String [] args ) {
					miStream archivo = new miStream();
					archivo.lee();
					//System.out.println();
	    }
		
	}
	
	



