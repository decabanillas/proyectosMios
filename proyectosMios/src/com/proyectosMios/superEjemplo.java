package com.proyectosMios;

public class superEjemplo {
	// Variable de instancia
    int miVariable; 
    
    // Constructor de la clase
    public superEjemplo() {
        miVariable = 5;
        }
    
    // Metodo con argumentos
    void miMetodo(int miVariable) { 
        System.out.println( "La variable Local miVariable contiene "
            + miVariable );
        System.out.println( 
            "La variable de Instancia miVariable contiene " 
            + this.miVariable );
        }
    
    public static void main( String args[] ) { 
        // Instanciamos un objeto del tipo de la clase
    	superEjemplo obj = new superEjemplo();
        // que utilizamos para llamar a su unico metodo
        obj.miMetodo( 10 ); 
        }
    }

