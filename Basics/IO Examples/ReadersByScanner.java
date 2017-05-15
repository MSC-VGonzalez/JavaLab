import java.io.*;
import java.util.Scanner;

public class ReadersByScanner{
	/* Método Main de la clase */
	public static void main(String args[]){
		try{
			readFloat();
		}catch(IOException ex){
			System.out.println("Error en la lectura por consola");
		}
	}
	
	/* Lectura desde teclado de un caracter mediante la clase Scanner */
	public static void readChar() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un caracter: ");
		buffer = new Scanner(System.in);
		Character character = buffer.next().charAt(0);
		System.out.println("El caracter ingresado fue: " + character);
	}
	
	/* Lectura desde teclado de una cadena mediante la clase Scanner*/
	public static void readString() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese una cadena de caracteres: ");
		buffer = new Scanner(System.in);
		String string = buffer.nextLine();
		System.out.println("La cadena ingresada fue: " + string);
	}
	
	/* Lectura desde teclado de un número entero mediante la clase Scanner */
	public static void readInt() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un número entero: ");
		buffer = new Scanner(System.in);
		Integer number = buffer.nextInt();
		System.out.println("El número entero ingresado fue: " + number);
	}
	
	/* Lectura desde teclado de un número de punto flotante mediante la clase Scanner */
	public static void readFloat() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un número de punto flotante: ");
		buffer = new Scanner(System.in);
		Float number = buffer.nextFloat();
		System.out.println("El número de punto flotante ingresado fue: " + number);
	}
}