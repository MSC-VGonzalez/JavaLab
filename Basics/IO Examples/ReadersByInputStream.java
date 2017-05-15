import java.io.*;
import java.lang.*;

public class ReadersByInputStream{
	/* M�todo Main de la clase */
	public static void main(String args[]){
		try{
			readFloat();
		}catch(IOException ex){
			System.out.println("Error en la lectura por consola");
		}
	}
	
	/* Lectura de un caracter desde teclado mediante la clase InputStream */
	public static void readChar() throws IOException{
		Character character      = null;
		BufferedReader buffer    = null;
		InputStreamReader stream = null;
		
		try {
			stream = new InputStreamReader(System.in);
			buffer = new BufferedReader(stream);
			System.out.println("Ingrese un caracter: ");
			character = (char)buffer.read();
			System.out.print("El caracter ingresado fue: " + character);
		}finally {
			if (stream != null){
				stream.close();
			}
		}
	}
	
	/* Lectura de una cadena de caracteres desde teclado mediante la clase InputStream */
	public static void readString() throws IOException{
		String string            = null;
		BufferedReader buffer    = null;
		InputStreamReader stream = null;
		
		try {
			stream = new InputStreamReader(System.in);
			buffer = new BufferedReader(stream);
			System.out.println("Ingrese una cadena de caracteres: ");
			string = buffer.readLine();
			System.out.print("La cadena ingresada fue: " + string);
		}finally {
			if (stream != null){
				stream.close();
			}
		}
	}
	
	/* Lectura de un n�mero entero desde teclado mediante la clase InputStream */
	public static void readInt() throws IOException{
		String string            = null;
		BufferedReader buffer    = null;
		InputStreamReader stream = null;
		
		try {
			stream = new InputStreamReader(System.in);
			buffer = new BufferedReader(stream);
			System.out.println("Ingrese un n�mero entero: ");
			string = buffer.readLine();
			System.out.print("El n�mero entero ingresado fue: " + Integer.parseInt(string));
		}finally {
			if (stream != null){
				stream.close();
			}
		}
	}
	
	/* Lectura de un n�mero de punto flotante desde teclado mediante la clase InputStream */
	public static void readFloat() throws IOException{
		String string            = null;
		BufferedReader buffer    = null;
		InputStreamReader stream = null;
		
		try {
			stream = new InputStreamReader(System.in);
			buffer = new BufferedReader(stream);
			System.out.println("Ingrese un n�mero de punto flotante: ");
			string = buffer.readLine();
			System.out.print("El n�mero de punto flotante ingresado fue: " + Float.parseFloat(string));
		}finally {
			if (stream != null){
				stream.close();
			}
		}
	}
}