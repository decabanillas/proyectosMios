package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*al implementar de serializable le decimos a nuestro programa
que se puede convertir a bytes nuestro objeto*/


public class pruebaSerializacion implements Serializable {
	
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //para q reconozca los cambios en la misma version, generalmete te pide si usas 
	//implements de alguna clase
	int sueldo;
	public pruebaSerializacion(int sueldo) {
		this.sueldo=sueldo*10;
	}
	
	public int darSueldo(int sueldo) {
		System.out.println(sueldo*100);
		return sueldo*100;
		
	}
	public String toString() {//reemplaza al system.out.println descripcion del objeto
		return "el sueldo es: " + sueldo*10;
	}
	
	
	public static void main (String [] args) {
		pruebaSerializacion pru =new pruebaSerializacion(50);
		//pru.darSueldo(50);
		//pasamos a bytes y lo rescatamos
		pruebaSerializacion[] sueldos=new pruebaSerializacion[3];//serializarlo
		
		sueldos[0]=pru;
		sueldos[1]=new pruebaSerializacion(20);
		sueldos[2]=new pruebaSerializacion(10);
		
		//try catch xq la lanza una excepcion del tipo ioexception
			try {
				//saldra al exterior
				ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Escritorio/Documents/java_ser/archivo.dat"));
				
				escribiendo_fichero.writeObject(sueldos);//lleva al archivo el objeto array
				escribiendo_fichero.close();
				
				
				//traemos del exterior y lo recuperamos
				ObjectInputStream recuperando_fichero= new ObjectInputStream(new FileInputStream("C:/Users/Escritorio/Documents/java_ser/archivo.dat"));
				//creamos este array de objeto para guardar lo q recuperemos
				//despues del igual hacemos el casting
				pruebaSerializacion[] sueldo_recuperado = (pruebaSerializacion[]) recuperando_fichero.readObject(); 
				recuperando_fichero.close();
				//for each
				for(pruebaSerializacion p:sueldo_recuperado) {
					System.out.println(p);
				}
					
			}catch(Exception e) {
				
				
			}
	}

}
