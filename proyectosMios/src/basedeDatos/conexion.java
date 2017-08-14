package basedeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
	Connection c = null;
	Statement stmt = null;
	public conexion() {
		
	}
	public void conectar()	throws SQLException {
		
	
		
		      try {
		         Class.forName("org.postgresql.Driver");
		         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba","postgres", "123");
		         c.setAutoCommit(false);
		         System.out.println("Opened database successfully");

		       
		      } catch ( Exception e ) {
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         System.exit(0);
		      }
		      
	}

	
	public void darDatos() throws SQLException  {
		
		 try {
			 this.conectar();
			 
			 stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM empleado ORDER by id ASC" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  name = rs.getString("nombre");
	            //String puesto=rs.getString("puesto");
	           // int age  = rs.getInt("age");
	            //String  address = rs.getString("address");
	            //float salary = rs.getFloat("salary");
	            System.out.println( "ID = " + id );
	            System.out.println( "Nombre = " + name );
	           // System.out.println( "Puesto = " + puesto );
	            //System.out.println( "ADDRESS = " + address );
	            //System.out.println( "SALARY = " + salary );
	           // System.out.println("hola");
	         }
	        rs.close();
	         stmt.close();
	         c.close();
		 
		 }catch(Exception e) {
			 System.err.println("error al selecionar");
			 System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
		 }
			
		 System.out.println("Operation done successfully");
         
	}
	
	public void insertarDatos() throws SQLException {
		try {
			this.conectar();
			stmt = c.createStatement();
	         String sql = "INSERT INTO empleado(id,nombre,edad) VALUES (7, 'Pul',18 )";
	         stmt.executeUpdate(sql);

	         

	         stmt.close();
	         c.commit();
	         c.close();
		}catch (Exception e) {
			System.out.println("error al insertar");
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
		}
		
		System.out.println("Records created successfully");
	}
	
	   public static void main( String args[] ) throws SQLException {
		   conexion conn=new conexion();
		   conn.darDatos();
		  // conn.insertarDatos();
	   }
	}