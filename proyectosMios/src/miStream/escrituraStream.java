package miStream;
import java.io.*;

public class escrituraStream {

	public  escrituraStream() {
		
	}
	
	public void escribir() {
		String frase="ya escribi";
		try {
			FileWriter escritura = new FileWriter("C:/Users/Escritorio/Desktop/tareas.txt",true);//true agrega al texto existente, no sobreescribe
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		}catch(IOException e) {
			System.out.println("No se escribio");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escrituraStream escribo = new escrituraStream();
		escribo.escribir();

	}

}
