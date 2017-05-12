import java.io.*;

public class Reading{
	public static void main (String args[]){
		int character = 0;
		
		System.out.println("Ingrese un caracer: ");
		try{
			character = System.in.read();
		}
		catch(IOException ex){
			System.out.println("Falló la lectura.");
		}
		finally{
			System.out.println("Echo: " + character);
		}
	}
}