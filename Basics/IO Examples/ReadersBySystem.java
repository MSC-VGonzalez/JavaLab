import java.io.*;
import java.lang.*;

public class ReadersBySystem{
	/* M�todo Main de la clase */
	public static void main(String args[]){
		try{
			readFloat();
		}catch(IOException ex){
			System.out.println("Error en la lectura por consola");
		}
	}
	
	/* Lectura de un caracter desde teclado mediante la clase System */
	public static void readChar() throws IOException{
		Character character = 0;
		
		System.out.println("Ingrese un caracter: ");
		character = (char)System.in.read();
		System.out.println("Caracter ingresado: " + character);
	}
	
	/* Lectura de una cadena de caracteres desde teclado mediante la clase System */
	public static void readString() throws IOException{
		String string = null;
		byte [] buffer = new byte[255];
		
		System.out.println("Ingrese una cadena de caracteres: ");
		System.in.read(buffer);
		string = new String(buffer);
		System.out.println("La cadena ingresada fue: " + string);
	}
	
	/* Lectura de un n�mero entero desde teclado mediante la clase System */
	public static void readInt() throws IOException{
		String string = null;
		byte [] buffer = new byte[255];
		
		System.out.println("Ingrese un n�mero entero: ");
		System.in.read(buffer);
		string = new String(buffer);
		System.out.println("El n�mero entero ingresado fue: " + Integer.parseInt(string.trim()));
	}
	
	/* Lectura de un n�mero de punto flotante desde teclado mediante la clase System */
	public static void readFloat() throws IOException{
		String string = null;
		byte [] buffer = new byte[255];
		
		System.out.println("Ingrese un n�mero de punto flotante: ");
		System.in.read(buffer);
		string = new String(buffer);
		System.out.println("El n�mero de punto flotante ingresado fue: " + Float.parseFloat(string.trim()));
	}
}